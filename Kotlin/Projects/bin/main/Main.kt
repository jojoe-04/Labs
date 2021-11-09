var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command (type 'quit' to quit): ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "balance" -> balance()
            "deposit" -> deposit(cmd[1].toDouble())
            "withdraw"-> validateWithdraw(cmd[1].toDouble())
            "quit" -> break

            else -> println("Invalid command")
        }
    }
}

fun balance() : Unit{
    println("Current balance: $funds")
}
fun doubleValidation(){
    // checks and validates double input for deposit & withrdaw
}
fun deposit(amount: Double) : Unit{
    funds += amount
    println("$amount Deposit Successful")
}

fun withdraw(amount: Double) : Unit{
    funds -= amount
    println("$amount Withdraw Successful")
}

fun validateWithdraw(amount: Double){
    if(amount >= funds){
        println("Insufficient Funds")
        return
    }
    print("Enter Password: ")
    var input = readLine()!!
    if(input == pswd) if(amount <= funds) withdraw(amount) else println("Invalid Password for Withdraw")
}

//fun getPassword(password: String, amount: Double){
  //  if(password == pswd) withdraw(amount)
   // else println("Invalid Password for Withdrawal")
//}