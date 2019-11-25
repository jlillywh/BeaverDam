package com.example.demo.view

import com.example.demo.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label("Reservoir Model") {
            addClass(Styles.heading)
        button("Build it!")
        }
    }
}

