SUMMARY = "Simple Hello World application built with C compiler"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://example-c"
S = "${WORKDIR}/example-c"

FILES:${PN} = "${bindir}/*"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    ${CC} -o hello_cc hello.c
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hello_cc ${D}${bindir}
}
