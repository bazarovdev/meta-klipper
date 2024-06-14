DESCRIPTION = "Moonraker server for Klipper "
HOMEPAGE = "https://github.com/Arksine/moonraker"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db95b6e40dc7d26d8308b6b7375637b6"

#inherit pkgconfig

RDEPENDS:${PN} += "\
    python3-tornado \
    python3-pyserial \
    python3-pyserial-asyncio \
    python3-pillow \
    python3-lmdb \
    python3-streaming-form-data \
    python3-distro \
    python3-inotify-simple \
    python3-libnacl \
    python3-paho-mqtt \
    python3-zeroconf \
    python3-preprocess-cancellation \
    python3-jinja2 \
    python3-dbus-next \
    python3-apprise \
    python3-ldap3 \
    "
    
DEPENDS = "\
    python3 \
    python3-tornado \
    python3-pyserial \
    python3-pyserial-asyncio \
    python3-pillow \
    python3-lmdb \
    python3-streaming-form-data \
    python3-distro \
    python3-inotify-simple \
    python3-libnacl \
    python3-paho-mqtt \
    python3-zeroconf \
    python3-preprocess-cancellation \
    python3-jinja2 \
    python3-dbus-next \
    python3-apprise \
    python3-ldap3 \
    "

# python3-python-periphery 

SRC_URI = "\
    git://github.com/Arksine/moonraker.git;branch=master;protocol=https \
    "

#SRCREV = "${AUTOREV}"
SRCREV = "3008a13efb6045a007456cb4f34a64afa6140617"
PV = "0.8.x_git${SRCPV}"

S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}"
#CONFFILES:${PN} += "${sysconfdir}/klipper/printer.cfg"

# from chelper/__init__.py:
#CFLAGS += "-fPIC -flto -fwhole-program -fno-use-linker-plugin"

# do_compile() {
#     # overwrite default do_compile that uses found `Makefile` for compiling firmware for printer's MCU
#     # Instead, compile the C helper module that usually compiled on first start of klipper and used internally
#     cd klippy/chelper/
#     ${CC} ${CFLAGS} ${LDFLAGS} -shared -o c_helper.so *.c
#     cd ../..
# }

do_install:append() {

    install -m 0755 -d ${D}${datadir}/moonraker
    cp -R --no-dereference --preserve=mode,links ${B}/moonraker ${D}${datadir}/

    # install -m 0755 -d ${D}${sysconfdir}/klipper
    # install -m 0755 -d ${D}${sysconfdir}/default
    # install -m 0644 ${WORKDIR}/klipper.default ${D}${sysconfdir}/default/klipper

    # #install -m 0755 -d ${D}${bindir}
    # #install -m 0755 ${B}/hub-ctrl ${D}${bindir}/hub-ctrl

    # install -d ${D}${localstatedir}/lib/klipper/sdcard
    # install -d ${D}${localstatedir}/lib/klipper/config
    # install -m 0644 ${S}/config/*.cfg ${D}${localstatedir}/lib/klipper/config
}

