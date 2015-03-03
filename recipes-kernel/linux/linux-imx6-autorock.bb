require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = "git://git@git.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
           file://defconfig \
"

SRCBRANCH = "imx_3.10.17_1.0.1_ga"
SRCREV = "${AUTOREV}"

DEPENDS += "lzop-native bc-native u-boot-mkimage-native"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.10.17+git${SRCPV}"
