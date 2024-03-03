SUMMARY = "Simple Hello World application built with CMake"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://example-c"
S = "${WORKDIR}/example-c"

FILES:${PN} = "${bindir}/*"

inherit cmake
