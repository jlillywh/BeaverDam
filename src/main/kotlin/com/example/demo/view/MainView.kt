package com.example.demo.view

import com.example.demo.app.Styles
import javafx.stage.StageStyle
import tornadofx.*
import javafx.scene.control.TextField

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
    override val root  = vbox {
        setPrefSize(200.0, 200.0)
        label("Edit Component Properties") {
            addClass(Styles.heading)
        }
        button("Elevation-Area-Volume").action {
            find<ElevAreaVolume>().openModal(stageStyle = StageStyle.UTILITY)
        }
    }
}

class CenterView: View() {
    var levelValue: TextField by singleAssign()
    var level:String by property<String>("")
    fun levelProperty() = getProperty(CenterView::level)

    init {
        level = "43.53"
    }

    override  val root  = vbox(1) {
        label("Reservoir Model") {
            addClass(Styles.heading)
        }
        hbox {
            label("Initial Water Level: ")
            levelValue = textfield()
            //label("This is the result: , $level").bind(levelProperty())
        }
        hbox {
            label("Spillway Crest Elevation: ")
            textfield()
        }
        button("Update") {
            useMaxWidth = true
            action {
                level = levelValue.text
            }
        }
        hbox {
            label("Reservoir level: ")
            label(level).bind(levelProperty())
            label("ft")
        }
    }
}

class RightView: View() {
    override  val root  = label("Right")
}

class BottomView: View() {
    override val root = label("Bottom View")
}
