require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/i-mx6/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_3.14.28_1.0.0_ga"
SRCREV = "${AUTOREV}"

DEPENDS += "lz4-native bc-native"
RDEPENDS_kernel-base_remove = "kernel-image"

COMPATIBLE_MACHINE = "wisehmi"

PV = "3.14.28+git${SRCPV}"

KERNEL_MODULE_PROBECONF += "phy-mxs-usb"
module_conf_phy-mxs-usb = "softdep phy-mxs-usb post: ci_hdrc_imx"
