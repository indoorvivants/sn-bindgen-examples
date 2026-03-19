#include <string.h>
#include "SDL2/SDL.h"

void __sn_wrap_sdl2_SDL_GUIDFromString(const char * pchGUID, SDL_GUID *____return) {
  SDL_GUID ____ret = SDL_GUIDFromString(pchGUID);
  memcpy(____return, &____ret, sizeof(SDL_GUID));
}


void __sn_wrap_sdl2_SDL_GUIDToString(SDL_GUID *guid, char * pszGUID, int cbGUID) {
 SDL_GUIDToString(*guid, pszGUID, cbGUID);
};


void __sn_wrap_sdl2_SDL_GameControllerGetBindForAxis(SDL_GameController * gamecontroller, SDL_GameControllerAxis axis, SDL_GameControllerButtonBind *____return) {
  SDL_GameControllerButtonBind ____ret = SDL_GameControllerGetBindForAxis(gamecontroller, axis);
  memcpy(____return, &____ret, sizeof(SDL_GameControllerButtonBind));
}


void __sn_wrap_sdl2_SDL_GameControllerGetBindForButton(SDL_GameController * gamecontroller, SDL_GameControllerButton button, SDL_GameControllerButtonBind *____return) {
  SDL_GameControllerButtonBind ____ret = SDL_GameControllerGetBindForButton(gamecontroller, button);
  memcpy(____return, &____ret, sizeof(SDL_GameControllerButtonBind));
}


char * __sn_wrap_sdl2_SDL_GameControllerMappingForGUID(SDL_JoystickGUID *guid) {
 return SDL_GameControllerMappingForGUID(*guid);
};


void __sn_wrap_sdl2_SDL_GetJoystickGUIDInfo(SDL_JoystickGUID *guid, Uint16 * vendor, Uint16 * product, Uint16 * version, Uint16 * crc16) {
 SDL_GetJoystickGUIDInfo(*guid, vendor, product, version, crc16);
};


void __sn_wrap_sdl2_SDL_JoystickGetDeviceGUID(int device_index, SDL_JoystickGUID *____return) {
  SDL_JoystickGUID ____ret = SDL_JoystickGetDeviceGUID(device_index);
  memcpy(____return, &____ret, sizeof(SDL_JoystickGUID));
}


void __sn_wrap_sdl2_SDL_JoystickGetGUID(SDL_Joystick * joystick, SDL_JoystickGUID *____return) {
  SDL_JoystickGUID ____ret = SDL_JoystickGetGUID(joystick);
  memcpy(____return, &____ret, sizeof(SDL_JoystickGUID));
}


void __sn_wrap_sdl2_SDL_JoystickGetGUIDFromString(const char * pchGUID, SDL_JoystickGUID *____return) {
  SDL_JoystickGUID ____ret = SDL_JoystickGetGUIDFromString(pchGUID);
  memcpy(____return, &____ret, sizeof(SDL_JoystickGUID));
}


void __sn_wrap_sdl2_SDL_JoystickGetGUIDString(SDL_JoystickGUID *guid, char * pszGUID, int cbGUID) {
 SDL_JoystickGetGUIDString(*guid, pszGUID, cbGUID);
};