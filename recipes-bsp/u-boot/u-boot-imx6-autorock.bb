require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Autorock imx6 boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "wisehmi"

PROVIDES = "u-boot"

SRCREV = "4be457bc96637a5cd73c80bc21a222bc098846b4"
SRCBRANCH = "v2014.10"
SRC_URI = "git://git@gitlab.autorock.com/i-mx6/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "2014.10+git${SRCPV}"
PR = "r0"

SEPB = "${WORKDIR}/build"
B = "${SEPB}"

EXTRA_OEMAKE = 'CROSS_COMPILE=/usr/bin/arm-linux-gnueabihf-'

do_configure() {
    make ${EXTRA_OEMAKE} ${UBOOT_MACHINE} -C ${S} O=${B}
}

do_compile_append() {
    cp ${B}/${SPL_BINARY} ${S}/${SPL_BINARY}
    cp ${B}/${UBOOT_BINARY} ${S}/${UBOOT_BINARY}
}
