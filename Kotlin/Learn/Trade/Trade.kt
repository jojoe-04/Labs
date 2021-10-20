var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...

            else -> println("Invalid command")
        }
    }
}