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

    var name: String = "John" // String specify
    val birthyear: Int = 1975 // Int specify

    println(name)
    println(birthyear)

    println(name)          // Print the value of name
    println(birthyear) 
    
}