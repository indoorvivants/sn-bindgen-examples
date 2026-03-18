FROM ubuntu@sha256:2e863c44b718727c860746568e1d54afd13b2fa71b160f5cd9058fc436217b30

RUN apt update && apt-get install -y curl && \
    # Install LLVM 17
    curl -Lo llvm.sh https://apt.llvm.org/llvm.sh && \
    chmod +x llvm.sh && \
    apt install -y lsb-release wget software-properties-common gnupg autopoint libtool git && \
    ./llvm.sh 17 && \
    apt install libclang-17-dev &&  \
    # Install JDK 21
    apt install -y gpg wget && \
    wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | gpg --dearmor | tee /etc/apt/trusted.gpg.d/adoptium.gpg > /dev/null && \
    echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | tee /etc/apt/sources.list.d/adoptium.list && \
    apt update && apt install -y temurin-21-jdk && \
    curl -Lo /usr/local/bin/sbt https://raw.githubusercontent.com/sbt/sbt/1.12.x/sbt && chmod +x /usr/local/bin/sbt && \
    # Install coursier (to run sn-vcpkg)
    curl -fLo /usr/local/bin/coursier https://github.com/coursier/launchers/raw/master/coursier && \
    chmod +x /usr/local/bin/coursier && \
    /usr/local/bin/coursier --version

ENV LLVM_BIN=/usr/lib/llvm-17/bin

WORKDIR /source/build

RUN wget -O - https://apt.kitware.com/keys/kitware-archive-latest.asc 2>/dev/null | gpg --dearmor - | tee /usr/share/keyrings/kitware-archive-keyring.gpg >/dev/null
RUN echo 'deb [signed-by=/usr/share/keyrings/kitware-archive-keyring.gpg] https://apt.kitware.com/ubuntu/ noble main' | tee /etc/apt/sources.list.d/kitware.list >/dev/null
RUN apt update
RUN apt -y install curl zip unzip tar ninja-build nasm cmake make pkg-config git libtirpc-dev bison flex cmake
RUN coursier launch sn-vcpkg --contrib -- bootstrap

COPY vcpkg.json .
ENV CC="/usr/lib/llvm-17/bin/clang"
ENV CXX="/usr/lib/llvm-17/bin/clang++"
RUN coursier launch sn-vcpkg --contrib -- install --manifest vcpkg.json
# RUN coursier launch sn-vcpkg --contrib -- install libmysql || (cat /root/.cache/sbt-vcpkg/vcpkg/buildtrees/libmysql/config-arm64-linux-out.log && exit 1)

COPY build.sbt .
COPY project/build.properties project/build.properties
COPY project/plugins.sbt project/plugins.sbt

RUN sbt update

# WORKDIR /source/tmp
# ENTRYPOINT ["sbt", "clean", "bindgenGenerateAll"]
