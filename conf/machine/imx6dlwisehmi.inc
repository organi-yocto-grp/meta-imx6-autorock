#@TYPE: Machine
#@NAME: Freescale i.MX6Q WiseHMI
#@SOC: i.MX6DL
#@DESCRIPTION: Machine configuration for Freescale i.MX6DL WiseHMI
#@MAINTAINER: Wang Yinnian <wangyinnian@autorock.com.cn>

require conf/machine/include/imx6wisehmi-common.inc

SOC_FAMILY = "mx6:mx6dl"

KERNEL_DEVICETREE = "imx6dl-wisehmi-dashboards.dtb"

UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd] = "mx6dlwisehmi_ddr128x32_mmc_spl_smp_defconfig"
UBOOT_CONFIG[nand] = "mx6dlwisehmi_nand_spl_defconfig,ubifs"

# fs related kernel  modules
KERNEL_MODULE_AUTOLOAD += "vfat nls_cp437 nls_iso8859-1"
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += " \
kernel-module-vfat \
kernel-module-nls-cp437 \
kernel-module-nls-iso8859-1 \
"

# USB related kernel modules
KERNEL_MODULE_AUTOLOAD += "phy-mxs-usb ci_hdrc_imx usb-storage sd_mod"
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += " \
kernel-module-phy-mxs-usb \
kernel-module-ci-hdrc-imx \
kernel-module-usb-storage \
kernel-module-sd-mod \
"
