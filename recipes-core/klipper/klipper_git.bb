DESCRIPTION = "Klipper 3D Printing Software"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

#inherit pkgconfig

RDEPENDS:${PN} = "\
    python3 \
    python3-pyserial \
    python3-cffi \
    python3-greenlet \
    python3-jinja2 \
    udev \
    "

SRC_URI = "\
    git://github.com/KevinOConnor/klipper.git;branch=master;protocol=https \
    "

#SRCREV = "${AUTOREV}"
SRCREV = "0d67d9c45d2dc39f8b4be7d1bb54b94b2698a2b6"
PV = "0.0.12_git${SRCPV}"

S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}"
CONFFILES:${PN} += "${sysconfdir}/klipper/printer.cfg"

# from chelper/__init__.py:
CFLAGS += "-fPIC -flto -fwhole-program -fno-use-linker-plugin"

do_compile() {
    # overwrite default do_compile that uses found `Makefile` for compiling firmware for printer's MCU
    # Instead, compile the C helper module that usually compiled on first start of klipper and used internally
    cd klippy/chelper/
    ${CC} ${CFLAGS} ${LDFLAGS} -shared -o c_helper.so *.c
    cd ../..
}

do_install:append() {

    install -m 0755 -d ${D}${datadir}/klippy
    cp -R --no-dereference --preserve=mode,links ${B}/klippy ${D}${datadir}/

    # install -m 0755 -d ${D}${sysconfdir}/klipper
    # install -m 0755 -d ${D}${sysconfdir}/default
    # install -m 0644 ${WORKDIR}/klipper.default ${D}${sysconfdir}/default/klipper

    # #install -m 0755 -d ${D}${bindir}
    # #install -m 0755 ${B}/hub-ctrl ${D}${bindir}/hub-ctrl

    # install -d ${D}${localstatedir}/lib/klipper/sdcard
    # install -d ${D}${localstatedir}/lib/klipper/config
    # install -m 0644 ${S}/config/*.cfg ${D}${localstatedir}/lib/klipper/config
}

