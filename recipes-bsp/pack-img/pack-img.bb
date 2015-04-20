DESCRIPTION = "Generate pack.img"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "emutils-native virtual/kernel"

PV = "1.0"

SRC_URI = ""

inherit deploy

PACK_IMG = "pack-${MACHINE}-${PV}-${PR}-${DATETIME}.img"
PACK_IMG_SYMLINK = "pack-${MACHINE}.img"
PACK_IMG_SYMLINK_SIMPLE = "pack.img"

do_compile() {
	ln -snf zImage-${KERNEL_DEVICETREE} ${DEPLOY_DIR_IMAGE}/${KERNEL_DEVICETREE}
	packimg -p512 ${DEPLOY_DIR_IMAGE}/${KERNEL_DEVICETREE}@0x12000000 ${DEPLOY_DIR_IMAGE}/zImage@0x10008000 ${B}/${PACK_IMG}
	rm ${DEPLOY_DIR_IMAGE}/${KERNEL_DEVICETREE}
}

do_deploy() {
    install -m 0644 ${B}/${PACK_IMG} ${DEPLOYDIR}/
    ln -snf ${PACK_IMG} ${DEPLOYDIR}/${PACK_IMG_SYMLINK}
    ln -snf ${PACK_IMG} ${DEPLOYDIR}/${PACK_IMG_SYMLINK_SIMPLE}
}
addtask deploy before do_build after do_compile

PACKAGES = ""

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install[noexec] = "1"
do_package[noexec] = "1"
do_packagedata[noexec] = "1"
do_package_write[noexec] = "1"
do_package_write_ipk[noexec] = "1"
do_package_write_rpm[noexec] = "1"
do_package_write_deb[noexec] = "1"
do_populate_sysroot[noexec] = "1"

