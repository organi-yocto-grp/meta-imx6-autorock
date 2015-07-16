require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_3.14.28_1.0.0_ga"
SRCREV = "77aced5899ff0102d1758f4f6396c282e34e2414"

DEPENDS += "lz4-native bc-native"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.14.28+git${SRCPV}"
