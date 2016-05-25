FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://asound.state-wm8960 \
"

do_install_prepend() {
    cp ${WORKDIR}/asound.state-wm8960 ${WORKDIR}/asound.state
}
