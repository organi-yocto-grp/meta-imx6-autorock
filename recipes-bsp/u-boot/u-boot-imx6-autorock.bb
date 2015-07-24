require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Autorock imx6 boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "wisehmi"

PROVIDES = "u-boot"

SRCREV = "8b0114c2cae13c7a6d55ebe7d2227f5d8fe5e719"
SRCBRANCH = "v2014.10"
SRC_URI = "git://git@gitlab.autorock.com/i-mx6/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "2014.10+git${SRCPV}"
