import libgit.functions.*
import libgit.types.*
import scala.scalanative.unsafe.*
import scala.scalanative.libc.*

@main def hello =
  Zone { implicit z =>
    git_libgit2_init()
    val ref = alloc[Ptr[git_repository]](1)
    val res = git_repository_open(
      ref,
      c"./"
    )

    stdio.printf(c"Repo path: %s\n", git_repository_path(!ref))

    val it = alloc[Ptr[git_branch_iterator]](1)
    git_branch_iterator_new(it, !ref, git_branch_t.GIT_BRANCH_REMOTE)

    val gitref = alloc[Ptr[git_reference]](1)
    val branch_type = alloc[git_branch_t](1)
    val str = alloc[Ptr[CChar]](100)

    while git_branch_next(gitref, branch_type, !it) == 0 do
      git_branch_name(str, !gitref)

      stdio.printf(c"Branch: %s\n", !str)

    git_libgit2_shutdown()
  }
