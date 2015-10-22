require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_3.10.17_1.0.1_ga"
SRCREV = "ea8ea3e0f442614d212cdfc81e081064bcf3300b"

DEPENDS += "lz4-native bc-native"
RDEPENDS_kernel-base_remove = "kernel-image"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.10.17+git${SRCPV}"
