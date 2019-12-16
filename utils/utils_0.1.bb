SUMMARY = "A Mosquitto Example"
DESCRIPTION = "A test application to demonstrate how to create a recipe for makefile-based project."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "mosquitto"

SRC_URI = "git://github.com/rizwan3413/MosquittoClient.git;protocol=git;tag=v${PV}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "'INCLUDE_DIR=${D}${includedir}' 'LIB_DIR=${D}${libdir}'"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/util-app ${D}${bindir}
}

INSANE_SKIP_${PN} = "dev-elf"
INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"
