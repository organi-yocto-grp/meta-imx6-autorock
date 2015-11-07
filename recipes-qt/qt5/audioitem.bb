DESCRIPTION = "EMUTILS"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

require recipes-qt/qt5/qt5.inc

DEPENDS += " \
    mpg123 \
    alsa-state \
    qtdeclarative \
"

RDEPENDS_audioitem-qmlplugins += "alsa-state"

SRCREV = "${AUTOREV}"
SRCBRANCH = "master"
PV = "1.0+git${SRCPV}"
PR = "r0"

SRC_URI = "git://git@gitlab.autorock.com/qt/audioitem.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"
