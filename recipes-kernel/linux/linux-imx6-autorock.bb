require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock imx6 boards"

SRC_URI = " \
	git://git@gitlab.autorock.com/wangyinnian/fsl-linux.git;branch=${SRCBRANCH};protocol=ssh \
	file://defconfig \
"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
#SRCREV = "5eb46104cd2eae40128c4158e8df90d64c9ac2e7"
SRCREV = "b410f6605811f1291c1c37e4b3c86f51aa15f41b"

DEPENDS += "lz4-native bc-native"
RDEPENDS_kernel-base_remove = "kernel-image"

COMPATIBLE_MACHINE = "wisehmi"

PV = "4.1.15+git${SRCPV}"

KERNEL_MODULE_PROBECONF += "phy-mxs-usb"
module_conf_phy-mxs-usb = "softdep phy-mxs-usb post: ci_hdrc_imx"
