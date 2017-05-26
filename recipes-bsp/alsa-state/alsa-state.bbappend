FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://asound.state-molihua \
"

do_install_prepend() {
    cp ${WORKDIR}/asound.state-molihua ${WORKDIR}/asound.state
}
