package com.example.demo.app

import java.time.LocalDate
import java.time.Period

class ElevationArea(val elev: Double, val area: Double) {
    val volume: Double get() = elev * area
}