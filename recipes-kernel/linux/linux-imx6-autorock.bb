require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@zkgit.iask.in/wangyinnian/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
SRCREV = "391981857ea83f5bfd9ffa97a00e6a49f669c318"

DEPENDS += "lz4-native bc-native"
RDEPENDS_kernel-base_remove = "kernel-image"

COMPATIBLE_MACHINE = "wisehmi"

PV = "4.1.15+git${SRCPV}"

KERNEL_MODULE_PROBECONF += "phy-mxs-usb"
module_conf_phy-mxs-usb = "softdep phy-mxs-usb post: ci_hdrc_imx"
