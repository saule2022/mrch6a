package com.Github.Daiva;case

class Person(name:String,
             relation:String,
             var topSpeed:Int) {
    println("Person creation started!")

    def increaseSpeed(delta:Int):Int=

    {
        topSpeed += delta
        topSpeed//in functional style we return new value in OOP (Object Oriented programming)  style we return nothing
    }

    println("person has been created with $name")
}
