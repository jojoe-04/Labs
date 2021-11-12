object Learn {

  def main(args: Array[String]): Unit = {

    // DECLARING VARIABLES
    // mutable
    var a: Int = 0
    println("a: " + a)

    // immutable variables
    val b: Int = 12
    println("b: " + b)

    // Expression evaluation
    val x = { val first: Int = 1; val second: Int = 2; first + second }
    println(x);

    // STRING INTERPOLATION
    val name: String = "Jojoe";
    val age: Int = 40;
    println(name + " is " + age + "years old") // concatenation
    println(
      s"$name is $age years old"
    ) // s string interpolation (not type safe)
    println(
      f"$name%s is $age%d years old"
    ) // f string interpolation ( provide type to make type safe)

    println("Hello \nWorld")
    println(raw"Hello \nWorld") // raw string interpolation

    // IF ELSE STATEMENTS
    // normal way
    val xr = 20;
    if (xr == 20) println(true)

    //if expressions
    val xrp = { if (xr == 20) "x==20" else "x!=20" }
    println(xrp)
    println({ if (xr == 20) "x==20" else "x!=20" })

    // WHILE LOOPS
    var loopIndex = 0;
    while (loopIndex < 2) {
      println(loopIndex);
      loopIndex += 1;
    }

    // FOR LOOPS
    //normal one line loops
    for (i <- 1 to 5) println(i)
    for (i <- 1.to(5)) println(i)
    for (i <- 1.until(5)) println(i)

    //nested
    for (i <- 1.until(5); j <- 1.until(5)) println(i + " & " + j)

    // iterate over list
    val list1 = List(1, 2, 3, 4, 5, 6)
    for (i <- list1) println(i)

    //Using filters (using an if statement)
    for (i <- list1; if i < 3) println(i)

    //For Loop expressions
    val result = for { i <- list1; if i < 3 } yield { i * i }
    println(result)

    // MATCH EXPRESSIONS - switch statements
    val newAge = 18;
    newAge match {
      case 18 => println("age is 18")
      case 20 => println("age is 20")
      case 21 => println("age is 21")

      case _ => println("default")
    }

    // return as expressions
    val result1 = newAge match {
      case 18 => newAge; case 20 => newAge; case _ => "default"
    }
    println(result1)

    // EvenODD- match expressions
    val num = 4;
    val evenOdd = num match {
      case 2 | 4 | 6 | 8 | 10 => "even";
      case 1 | 3 | 5 | 7 | 9  => "odd"; case _ => "default";
    }
    println(evenOdd)

    // FUNCTION DEMO
    println(addTwo(4, 4))
    println(addTwoReturn(4, 4))
    println(addTwoShort(4, 4))

    //call from Object
    println(Math.add(4, 4))
    println(Math.subtract(4, 4))
    println(Math.multiply(4, 4))

    // only one argument function
    println(Math square 2)
    println(Math.addDefault(2))

    // ANONYMOUS FUNCTIONS - nameless function assigned to variable
    var addAnon = (x: Int, y: Int) => x + y;
    println(addAnon(300, 500))

    // HIGH ORDER fUNCTIONS - takes functions as arguments and also return functions
    var highOrder =
      math(5, 5, (x, y) => x + y); // pass in anonymous function as f
    println(highOrder)
    highOrder = math(5, 5, (x, y) => x * y);
    println(highOrder)
    highOrder = math(5, 5, (x, y) => x min y);
    println(highOrder)

    // function in function highOrder
    var highOrderII = mathII(5, 6, 1, (x, y) => x max y);
    println(highOrderII)

    // Using wildcards
    // highOrderII = mathII(5, 6, 1, (x, y) => _ max _);
    // println(highOrderII)
  }

  // FUNCTIONS
  // 1st declaration
  def addTwo(x: Int, y: Int): Int = {
    return x + y
  }

  // without return
  def addTwoReturn(x: Int, y: Int): Int = {
    x + y
  }

  // shorter version 2
  def addTwoShort(x: Int, y: Int): Int = x + y;

//   shorter 3
  def addTwoShorter(x: Int, y: Int) = x + y;

  // Object of functions
  object Math {
    // add
    def add(x: Int, y: Int) = x + y;
    //subtract
    def subtract(x: Int, y: Int) = x - y;
    //multiply
    def multiply(x: Int, y: Int) = x * y;
    //Only one argument function (square)
    def square(x: Int) = x * x;
    // default parameters
    def addDefault(x: Int = 0, y: Int = 0) = x + y;
    // no return value
    def printValues(x: Int, y: Int): Unit = println(x + y);
  }

  // HIGH ORDER fUNCTIONS - takes functions as arguments and also return functions
  def math(x: Double, y: Double, f: (Double, Double) => Double) = f(x, y);

  def mathII(x: Double, y: Double, z: Double, f: (Double, Double) => Double) =
    f(f(x, y), z);

}
