/*
  Learning Kotlin Syntax
*/

fun main(){
    println("Hello World!")
    println("I am learning Kotlin.")
    println("It is awesome!")
    println(" ")
    add()
    println(" ")
    variableExplore()
}

// This is a comment
fun add(){
    println("Function to add 3 & 3")
    println(3 + 3)
}

fun variableExplore(){
    var name = "John" // can change
    val birthyear = 1975  // cannot change

    // var name: String = "John" // String specify
    // val birthyear: Int = 1975 // Int specify

    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    println(name)          // Print the value of name
    println(birthyear) 
    
}

fun typeConversion(){
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()
    val x: Int = 5;
    val y: Long = x.toLong();
    println(y)
}

fun stringManipulation(){
    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt.length)

    var txt = "Hello World"
    println(txt.toUpperCase())   // Outputs "HELLO WORLD"
    println(txt.toLowerCase())   // Outputs "hello world

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    var txt = "Please locate where 'locate' occurs!"    
    println(txt.indexOf("locate"))  // Outputs 7

    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)


}

fun conditions(){
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
}

fun whenStatement(){
    val day = 4
    val result = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Invalid day."
    }
    println(result)
}



fun learnArrays(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    println(cars.size)
    if ("Volvo" in cars) println("It exists!")

    //ranges
    for (nums in 5..15) {
        println(nums)
    }

}
