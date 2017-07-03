
IMAGE_FSTYPES += "ext4"

IMAGE_INSTALL_append_imx6dlwisehmi-lavender += "update-lavender"
IMAGE_INSTALL_append_imx6dlwisehmi-lavender-cpt += "update-lavender"
IMAGE_INSTALL_append_imx6dlwisehmi-lavender-ch += "update-lavender"
IMAGE_INSTALL_append_imx6dlwisehmi-hall += "update-hall"
IMAGE_INSTALL_append_imx6dlwisehmi-hall-ch += "update-hall"
IMAGE_INSTALL_append_imx6dlwisehmi-dashboards-b15a += "update-b15a"

BAD_RECOMMENDATIONS += " \
    qtbase-fonts-ttf-vera \
    qtbase-fonts-ttf-dejavu \
    qtbase-fonts-pfa \
    qtbase-fonts-pfb \
    qtbase-fonts-qpf \
"
