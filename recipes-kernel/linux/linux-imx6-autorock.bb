require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_3.14.28_1.0.0_ga"
SRCREV = "83a24b77ee48b76dbcc458c9cc4c07df1920a623"

DEPENDS += "lz4-native bc-native"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.14.28+git${SRCPV}"
