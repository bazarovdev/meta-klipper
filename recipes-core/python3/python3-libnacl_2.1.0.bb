SUMMARY = "binding to libsodium NaCl"
HOMEPAGE = "https://pypi.org/project/libnacl/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c8a70e4958da99fa55f2fa83dd35c8d"

SRC_URI[sha256sum] = "f3418da7df29e6d9b11fd7d990289d16397dc1020e4e35192e11aee826922860"

inherit pypi python_poetry_core

#RDEPENDS:${PN} = "graphviz python3-pyparsing"

DEPENDS += "\
    libsodium \
"
