package com.example.demo.view

import com.example.demo.app.ElevationArea
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.time.LocalDate

class DamEditor : Fragment("Dam Editor") {
    val controller: DamController by inject()
    val input = SimpleStringProperty()

    private val elevations = listOf(
            ElevationArea(0.0, 0.0),
            ElevationArea(1.0, 13.0),
            ElevationArea(2.0, 18.0),
            ElevationArea(3.0, 22.0),
            ElevationArea(4.0, 30.0)
    ).observable()

    override val root = form {
        prefWidth = 300.0

        fieldset("Dam Editor") {
            field("Starting Level") {
                textfield(input)
            }
            field("Spillway Crest") {
                textfield()
            }
            tableview(elevations) {
                readonlyColumn("Elevation",ElevationArea::elev)
                readonlyColumn("Area", ElevationArea::area)
                readonlyColumn("Volume", ElevationArea::volume)
            }
            button("Save") {
                shortcut("Alt+S")
                action {
                    save()
                }
            }
        }

    }
    private fun save() {
        controller.writeToDB(input.value)
        input.value = ""
        close()
    }
}

class DamController: Controller() {
    fun writeToDB(inputValue: String) {
        println("Writing $inputValue to database!")
    }
}
