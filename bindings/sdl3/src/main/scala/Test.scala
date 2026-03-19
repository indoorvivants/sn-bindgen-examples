import sdl3.all.*
import scalanative.unsafe.*

// Testing a video game library on CI is hard
@main def hello =
  Zone:
    println(fromCString(SDL_GetPlatform()))
