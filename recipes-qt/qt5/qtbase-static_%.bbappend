FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0002-add-linux-imx6-g-device.patch"
EXTRA_COMPILER_FLAGS += "-DLINUX=1 -DEGL_API_FB=1"
EXTRA_LINKER_FLAGS += "-static-libgcc"
