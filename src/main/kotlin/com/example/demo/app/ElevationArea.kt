package com.example.demo.app

import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.time.LocalDate
import java.time.Period

class ElevationArea(elev: Double, area: Double, volume: Double) {

    val elevProperty = SimpleDoubleProperty(elev)
    var elev by elevProperty

    val areaProperty = SimpleDoubleProperty(area)
    var area by areaProperty

    val volumeProperty = SimpleDoubleProperty(volume)
    var volume by volumeProperty
}

class MyController: Controller() {
    val elevations = listOf(
            ElevationArea(0.0, 0.0, 0.0),
            ElevationArea(1.0, 13.0, 6.5),
            ElevationArea(2.0, 18.0, 22.0),
            ElevationArea(3.0, 22.0, 42.0),
            ElevationArea(4.0, 30.0, 68.0)
    ).observable()
}