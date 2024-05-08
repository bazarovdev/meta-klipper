SUMMARY = "GCode processor to add klipper cancel-object markers"
HOMEPAGE = "https://pypi.org/project/preprocess-cancellation"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit pypi python_poetry_core

PYPI_SRC_URI = "git://github.com/kageurufu/preprocess_cancellation;protocol=https;branch=main"
SRCREV="8f717dc1595638338ba41f37ee99a2946ee48751"
S = "${WORKDIR}/git"

