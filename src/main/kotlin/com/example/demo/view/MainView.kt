package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*

class MainView : View("Hello TornadoFX") {
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
    override val root = label("Top View") {
        label("Reservoir Model") {
            addClass(Styles.heading)
        }
    }
}

class LeftView: View() {
    override  val root  = label("Left")
}

class CenterView: View() {
    override  val root  = label("Center")
}

class RightView: View() {
    override  val root  = label("Right")
}

class BottomView: View() {
    override val root = label("Bottom View")
}

