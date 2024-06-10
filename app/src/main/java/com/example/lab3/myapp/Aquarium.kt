package com.example.lab3.myapp

import kotlin.math.PI

class Aquariums (var length: Int=100, var width: Int = 20, var height: Int =40){
    init{
        println("aquarium initializing")
    }
    //    init{
//        println("volume: ${width* lenght*height/1000} liters")
//    }
    constructor(numberOfFish: Int) : this(){
        val tank = numberOfFish *2000*1.1
        height = (tank / (length*width)).toInt()
    }
    var volume: Int
        get ()= width*height *length/1000
        set(value){
            height=(value*1000)/(width* length)
        }
    class Aquarium (var lenght: Int = 100, var width: Int =20, var height: Int=40) {
         var volume: Int
            get() = width * height * lenght / 1000
            set(value) {
                height = (value * 1000) / (width * lenght)
            }
    }
    val shape = "rectangle"
    var water: Double=0.0
        get() = volume*0.9

    fun printSize(){
        println(shape)
        println("Width: $width cm" +
                "Lenght: $length cm " +
                "Height: $height cm")
        println("Volume: $volume liters Water: $water liters(${water/volume*100.0}% full)")

    }
}