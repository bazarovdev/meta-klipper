SUMMARY = "Streaming parser for multipart/form-data"
HOMEPAGE = "https://pypi.org/project/streaming-form-data"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=297bf03ed7725a462a4450e7e00fb361"

SRC_URI[sha256sum] = "34087788c88912caa5b658020d1df66320369a8d98ec3a427dc36fd2618d864f"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    python3-smart-open \
    "
