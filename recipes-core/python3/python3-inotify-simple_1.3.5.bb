SUMMARY = " a simple Python wrapper around inotify"
HOMEPAGE = "https://pypi.org/project/inotify-simple"

LICENSE = "BSD-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=28a8c10291bba0bc0f8b9d5e87c0d826"

inherit pypi setuptools3
# for some reason this specific link is in different format from defined in pypi.bbclass
#PYPI_SRC_URI = "https://files.pythonhosted.org/packages/51/41/59ca6011f5463d5e5eefcfed2e7fe470922d3a958b7f3aad95eda208d7d3/inotify_simple-1.3.5.tar.gz;downloadfilename=${PN}-${PV}.tar.gz;striplevel=1"
PYPI_SRC_URI = "git://github.com/chrisjbillington/inotify_simple;protocol=https;branch=master"
SRCREV="2a8f8305125c396896835f0ea4593477d007ff4b"
S = "${WORKDIR}/git"
