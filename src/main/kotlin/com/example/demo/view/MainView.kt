package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.stage.StageStyle
import tornadofx.*

class MainView : View("Beaver Dam Model", icon = FX.icon) {
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

class LeftView: View() {
    override val root  = stackpane {
        setPrefSize(300.0, 200.0)
        button("Open Editor").action {
            find<Editor>().openModal(stageStyle = StageStyle.UTILITY)
        }
    }
}

class CenterView: View() {
    override  val root  = vbox(1) {
        label("Reservoir Model") {
            addClass(Styles.heading)
        }
        hbox {
            label("First Name: ")
            textfield()
        }
        hbox {
            label("Last Name: ")
            textfield()
        }
    }
}

class RightView: View() {
    override  val root  = label("Right")
}

class BottomView: View() {
    override val root = label("Bottom View")
}

class Editor: Fragment("Editor") {
    override val root = form {
        prefWidth = 300.0

        fieldset("Editor") {
            field("First field") {
                textfield()
            }
            field("Second field") {
                textfield()
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
        close()
    }
}

