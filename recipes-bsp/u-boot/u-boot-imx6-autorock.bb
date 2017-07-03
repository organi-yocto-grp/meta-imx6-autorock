require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Autorock imx6 boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "wisehmi"

PROVIDES = "u-boot"

SRCREV = "${AUTOREV}"
SRCBRANCH = "v2014.10"
#SRC_URI = "git://git@zkgit.iask.in/i-mx6/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"
SRC_URI = "git://git@zkgit.iask.in/wangyinnian/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"
SRCBRANCH = "serial_bak"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "2014.10+git${SRCPV}"
PR = "r0"

EXTRA_OEMAKE = 'CROSS_COMPILE=arm-buildroot-linux-gnueabihf-'
