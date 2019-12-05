package com.example.demo.view

import com.example.demo.app.ElevationArea
import com.example.demo.app.MyController
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class DamEditor : Fragment("Dam Editor") {
    val controller: DamController by inject()
    val input = SimpleStringProperty()

    val elevationsController: MyController by inject()

    override val root = form {
        prefWidth = 300.0

        fieldset("Dam Editor") {
            field("Starting Level") {
                textfield(input)
            }
            field("Spillway Crest") {
                textfield()
            }
            tableview(elevationsController.elevations) {
                isEditable = true
                column("Elevation",ElevationArea::elev).makeEditable()
                column("Area", ElevationArea::area).makeEditable()
                column("Volume", ElevationArea::volume).makeEditable()
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
