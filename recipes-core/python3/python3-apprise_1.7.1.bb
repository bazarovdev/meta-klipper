SUMMARY = "Apprise allows you to send a notification to almost all of the most popular notification services available"
HOMEPAGE = "https://pypi.org/project/apprise"

LICENSE = "BSD-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=07bf2ebc6a3273c6f39c9450c33180f0"

SRC_URI[sha256sum] = "8d439d08550470524425dedee4bc8a72766c216c218f3772c37404eb2fd86e5a"

inherit pypi setuptools3

DEPENDS += "python3-pip-native python3-babel-native"