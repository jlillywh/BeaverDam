package com.example.demo.app

import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleFloatProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class DamModel(dam: Dam) : ItemViewModel<Dam>(dam) {
    val name = bind(Dam::nameProperty)
//    val startLevel = bind(Dam::startLevelProperty)
//    val spillwayCrest = bind(Dam::spillwayCrestProperty)
}

class Dam(name: String? = null, startLevel: Number? = null, spillwayCrest: Number? = null) {
    val nameProperty = SimpleStringProperty(name)
    var name by nameProperty

//    val startLevelProperty = SimpleDoubleProperty(startLevel)
//    var startLevel by startLevelProperty
//
//    val spillwayCrestProperty = SimpleDoubleProperty(spillwayCrest)
//    var spillwayCrest by spillwayCrestProperty
}
