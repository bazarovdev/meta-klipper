# Meta-Klipper

A beginning of a [Yocto](https://www.yoctoproject.org/) layer that provides recipes for:  
* [Klipper](https://www.klipper3d.org/) – 3D printer firmware and Python controller
* [Moonraker](https://github.com/Arksine/moonraker) – Klipper API over web
* [Mainsail](https://github.com/mainsail-crew/mainsail) – Web front-end for Klipper
* Python dependencies

Inspired by [klipper-linux](https://github.com/jin-eld/klipper-linux), but removes the need to patch Klipper and allows using the latest releases as-is. The original project included specific configuration files, but this is a standalone layer that can be used directly in your project as an independent Yocto layer.

There are mentions of a similar layer in [PrintNanny-OS](https://github.com/bitsy-ai/printnanny-os), but I couldn't find it on GitHub.  
**Update:** The recipes are now available here: [meta-printnanny](https://github.com/bitsy-ai/meta-bitsy/tree/main/meta-printnanny)
