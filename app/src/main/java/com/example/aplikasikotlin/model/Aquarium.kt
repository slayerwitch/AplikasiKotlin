package com.example.aplikasikotlin.model

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    /*
    * --------------------
    * Getter and Setter
    * --------------------
    * */
    // 1 liter = 1000 cm^3
    // Codelab 3 (step 4): Mengatur visibilitas class member
    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
        private set(value) {
            height = (value * 1000) / (width * length)
        }

    init {
        println("aquarium initializing")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
        println("---------------------------\n") // Garis batas
    }

}