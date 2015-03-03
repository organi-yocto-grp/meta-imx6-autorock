
IMAGE_FSTYPES += "cpio"

IMAGE_INSTALL += " dashboard-njgdbus"

pre_process_image_cpio() {
	install -d ${IMAGE_ROOTFS}/initroot
	find ${IMAGE_ROOTFS} -mindepth 1 -not -name initroot -prune -print0 | xargs -0 mv --target-directory=${IMAGE_ROOTFS}/initroot
}

IMAGE_PREPROCESS_COMMAND += "pre_process_image_cpio;"

IMAGE_CMD_cpio () {
	(cd ${IMAGE_ROOTFS} && find initroot | cpio -o -H newc >${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.cpio)
}



