DESCRIPTION = "EMUTILS"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "eb0fe6f4c13627422bb0b9475e340849b295602e"
SRCBRANCH = "master"
PV = "1.0+git${SRCPV}"
PR = "r0"

SRC_URI = "git://git@gitlab.autorock.com/i-mx6/mmdc.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${bindir}
	install -m 755 ${B}/mmdc ${D}${bindir}
}
