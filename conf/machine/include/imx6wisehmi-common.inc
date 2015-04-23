# Provides the i.MX6 WiseHMI common settings

MACHINEOVERRIDES = "wisehmi:${MACHINE}"
MACHINE_CLASS = "wisehmi"

require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa9.inc

SERIAL_CONSOLE = "115200 ttymxc3"

PREFERRED_PROVIDER_u-boot = "u-boot-imx6-autorock"
#PREFERRED_VERSION_u-boot-imx6-autorock = "2014.10"

PREFERRED_PROVIDER_virtual/kernel = "linux-imx6-autorock"
#PREFERRED_VERSION_linux-imx6-autorock = "3.10.17"

PREFERRED_PROVIDER_jpeg = "libjpeg-turbo"

KERNEL_IMAGETYPE = "zImage"

IMAGE_FSTYPES = "tar.bz2"

MACHINE_FEATURES_remove = "usbgadget usbhost alsa touchscreen"

# remove getty tty* from /etc/inittab
USE_VT = "0"

SPL_BINARY = "SPL"
UBOOT_SUFFIX = "img"
UBOOT_MAKE_TARGET = "all"

KERNEL_MODULE_AUTOLOAD += "vfat af_packet fec mii smsc"
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += " \
kernel-module-vfat \
kernel-module-af_packet \
kernel-module-fec \
kernel-module-mii \
kernel-module-smsc \
"