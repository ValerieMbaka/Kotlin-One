package oop

fun main(args: Array<String>) {
    // These are objects
    var f1 = Fruit("Mango", "Yellow", "200g", 30.0)
    var f2 = Fruit("Apple", "Green", "250g", 35.0)
    println(f1.name)
    println(f2.color)

    var c1 = Car("Toyota", "KDG 009J", 3000000.00)
    var c2 = Car("Mercedes", "KDJ 780G", 4500000.00)
    println(c2.model)
    println(c1.reg_no)
    c2.accelerate()
    c1.brake()
}

// This is a class
class Fruit(name:String, color:String, size:String, price:Double){
    // Declare properties
    var name:String
    var color:String
    var size:String
    var price:Double
    // Initialise the properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
}

class Car(model:String, reg_no:String, price: Double){
    var model:String
    var reg_no:String
    var price:Double

    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("Yeah, I am a $model and I can brake")
    }
}