require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = "git://git@git.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
           file://defconfig \
"

SRCBRANCH = "imx_3.10.17_1.0.1_ga"
SRCREV = "3ad2eee174d6b74e5a2238126aa1f09f76e3ae0d"

DEPENDS += "lz4-native bc-native"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.10.17+git${SRCPV}"
