LICENSE = "CLOSED"

SRC_URI = "file://example-copy-file"
S = "${WORKDIR}/example-copy-file"

do_install() {
    install -m 0700 -d ${D}/home/root
    install -m 0600 ${S}/file-to-copy.txt ${D}/home/root
}

FILES:${PN} = "/home/root/*"
