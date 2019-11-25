package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*

class TopView: View() {
    override val root = hbox {
        menubar {
            menu("File") {
                menu("Connect") {
                    item("Facebook")
                    item("Twitter")
                }
                item("Save")
                item("Quit")
            }
            menu("Edit") {
                item("Copy")
                item("Paste")
            }
            menu("Build") {
                item("Climate Controls")
                item("Storage")
                item("Conduits")
            }
            menu("Model") {
                item("Options")
            }

        }
    }
}