SUMMARY = "dashboard update application"
SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
	git://git@gitlab.autorock.com/huatai-dashboard/Lavender-update.git;branch=${SRCBRANCH};protocol=ssh \
	file://update \
"

SRCBRANCH = "master"
SRCREV = "0ffe6a33f4c82c469fbaa99e89acac321155d0a6"
PV = "1.3+git${SRCPV}"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

DEPENDS = "qtdeclarative qtquickcontrols"
DEPENDS += "update-rc.d-native"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/bin/update ${D}${bindir}

	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/update ${D}${sysconfdir}/init.d
	update-rc.d -r ${D} update start 45 S .
}

RDEPENDS_${PN} = "qtbase-plugins qtdeclarative-qmlplugins qtquickcontrols-qmlplugins"
