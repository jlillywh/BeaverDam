package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*

class MainView : View("Beaver Dam Model") {
    val topView: TopView by inject()
    val leftView: LeftView by inject()
    val centerView: CenterView by inject()
    val rightView: RightView by inject()
    val bottomView: BottomView by inject()

    override val root = borderpane() {
        top = topView.root
        left = leftView.root
        center = centerView.root
        right = rightView.root
        bottom = bottomView.root
    }
}

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

class LeftView: View() {
    override  val root  = label("Left")
}

class CenterView: View() {
    override  val root  = label("Center") {
        label("Reservoir Model") {
            addClass(Styles.heading)
        }
    }
}

class RightView: View() {
    override  val root  = label("Right")
}

class BottomView: View() {
    override val root = label("Bottom View")
}

