INHIBIT_PACKAGE_STRIP = "0"
INHIBIT_PACKAGE_DEBUG_SPLIT = "0"

do_install_append() {
	# files under /opt have already been strip
	rm -rf ${D}/opt
}
