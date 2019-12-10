package com.example.demo.view

import com.example.demo.app.Dam
import com.example.demo.app.DamModel
import tornadofx.*

class DamEditor : View("Dam Editor") {
    override val root = borderpane {
        val dams = listOf(
                Dam("Jones Dam", 22.1, 32.5),
                Dam("Kilt Dam", 34.5, 50.2)
        )
        val model = DamModel(Dam())

    }
}
