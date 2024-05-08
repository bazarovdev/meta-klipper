SUMMARY = "efficient streaming of very large files"
HOMEPAGE = "https://pypi.org/project/smart-open"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=5c68cd40b6115d100370f3dcee3924cb"

inherit pypi setuptools3
# for some reason this specific link is in different format from defined in pypi.bbclass
PYPI_SRC_URI = "git://github.com/piskvorky/smart_open;protocol=https;branch=master"
SRCREV="299ca52b09efc2659ae9248d3dbb034cd7773cc4"
S = "${WORKDIR}/git"
