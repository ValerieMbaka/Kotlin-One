fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight =100
    var height = 1.9
    var bmi = weight / (height * height)
    println(bmi)
    if (bmi<=18){
        println("Underweight")
    }else if (bmi<=24){
        println("Normal weight")
    }else if (bmi<=29){
        println("Overweight")
    }else{
        println("Obese")
    }

    var mark = 85
    if (mark>=75){
        println("Grade A")
    }else if (mark>=65){
        println("Grade B")
    }else if (mark>=55){
        println("Grade C")
    }else if (mark>=45){
        println("Grade D")
    }else if (mark>=35){
        println("Grade E")
    }else{
        println("Fail")
    }
    // WHEN STATEMENTS
    var bettingNumber = 0
    when(bettingNumber){
        1 -> {
            println("You lost")
        }
        2 -> {
            println("You lost")
        }
        3 -> {
            println("You won")
        }
        4 -> {
            println("You lost")
        }
        else->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}