import java.util.Date;
import Array.concat;
object Learn {

  def main(args: Array[String]): Unit = {

    //  --------------------- DECLARING VARIABLES--------------------------
    // mutable
    var a: Int = 0
    println("a: " + a)

    // immutable variables
    val b: Int = 12
    println("b: " + b)

    // Expression evaluation
    val x = { val first: Int = 1; val second: Int = 2; first + second }
    println(x);

    //  ---------------------  STRING INTERPOLATION--------------------------
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

    // -------------- IF ELSE STATEMENTS -------------------
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

    //  --------------------- FOR LOOPS --------------------------
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

    // --------------------- MATCH EXPRESSIONS - switch statements ---------
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

    //  --------------------- FUNCTIONAL PROGRAMING --------------------------
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

    // PARTIALLY APPLIED FUNCTIONS
    // full applied function
    val sum = (x: Int, y: Int, z: Int) => x + y + z;
    println(sum(4, 4, 4))

    val sum2 = sum(4, 4, _: Int)
    println(sum2(4))

    //partially applied
    val date = new Date();
    val logPartial = log(date, _: String);
    logPartial("Error 1");
    logPartial("Error 2");
    logPartial("Error 3");

    // CLOSURES - uses one or more variables declared out of the function
    var number1 = 10; //impure closure
    val number = 10; //pure closure
    val addTen = (x: Int) => x + number;
    println(addTen(10))

    // CURRYING - transform function from multiple args to function to single args
    println(addTwoCurry(20)(10));

    val sum5 = addTwoCurry(5);
    println(sum5(10))

    // curry def two
    println(addTwoCurryII(40)(40));

    // partial curry
    val sum10 = addTwoCurryII(10) _;
    println(sum10(50));

    //  --------------------- STRINGS --------------------------
    // string methods
    val str: String = "Hello World";
    println(str.length()); // string Lengths
    println(str.concat(" Again")); // concatenate

    // string formatting
    val num3 = 75;
    val num4 = 100.25;
    printf("(%f)", num4);
    println("(%f)".format(num4));

    // ARRAYS
    val myArray: Array[Int] = new Array[Int](5);
    val myArray2 = new Array[Int](5);
    val myArray3 = Array(1, 2, 3, 5, 6);
    myArray(0) = 20;
    println(myArray);

    for (i <- myArray) println(i);
    for (i <- 0.until(myArray.length)) println(myArray(i));

    // val myArray4 = Array.concat(myArray, myArray3);
    // for (i <- myArray4) println(myArray(i));

    //  --------------------- LISTS --------------------------
    val list2: List[Int] = List(1, 2, 3, 4, 5);
    println(list2)

    println(0 :: list2); // prepend using const
    println(10 :: 20 :: 30 :: Nil); // new list by const to nil
    println(list2.head); // first element
    println(list2.isEmpty); // check if empty
    println(list2.reverse); // reverse list
    println(List.fill(10)(2)); // fill 10 of 2s
    println(list2.max) // max

    list2.foreach(println)
    // add all elements to list
    var total = 0;
    list2.foreach(total += _)
    println(total)

    // add all elements for loop
    var total2: Int = 0;
    for (i <- list2) total2 += i;
    println(total2)

    //--------------------- SETS --------------------------
    val mySet: Set[Int] = Set(1, 2, 3, 4, 5); // immutable
    val mySet2: Set[Int] = Set(5, 6, 7, 8, 9, 10); //
    println(mySet)

    val myMutableSet = scala.collection.mutable.Set(1, 2, 3, 4, 5);
    println(myMutableSet);

    //no indexing
    println(mySet(2)); // checks if 2 is in Set

    // concatenate two sets
    println(mySet ++ mySet2); //add two sets
    println(mySet.++(mySet2)); //add two sets (one argument notation)

    // intersection
    println(mySet & mySet2);
    println(mySet.intersect(mySet2));
    println(mySet.max); // max

    // print all
    mySet.foreach(println)
    for (each <- mySet) println(each)

    //--------------------- MAPS --------------------------
    val myMap: Map[Int, String] =
      Map(1 -> "Jojoe", 2 -> "Dzifa", 3 -> "Edem", 4 -> "Ray");

    println(myMap)
    println(myMap(3))
    println(myMap.keys);
    println(myMap.values);

    myMap.keys.foreach { key =>
      println("key :" + key);
      println("value :" + myMap(key));

    }

    //--------------------- TUPLES -------------------------- (heterogenous datatype)
    val myTuple = (1, 2, 3, "Hello", 'o');
    println(myTuple);
    val myTuple2 = new Tuple2(1, 2);
    println(myTuple._3);

    myTuple.productIterator.foreach { println }

    //--------------------- OPTIONS TYPE -------------------------- (some or none)
    val list4 = List(1, 2, 3, 4);
    val map4 = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four");

    //some or none
    println(list4.find(_ > 6));
    println(list4.find(_ > 2));
    println(map4.get(1));

    // value in some or none
    println(list4.find(_ > 2).getOrElse(0)); // get value else 0

    // define an option
    val opt1: Option[Int] = Some(1);
    println(opt1.get);
    println(opt1.isEmpty)

    //--------------------- map & filter method -------------------------- (some or none)
    println(list4.map(_ * 2));
    println(list4.map(x => x * 2));
    println(map4.map(_ + "hi"));
    println(map4.mapValues(x => x + "1"));

    //lists of lists
    val list5 = List(List(1, 2, 3, 4, 5), List(2, 4, 6, 8));
    println(list5.flatten);

    //flatMap
    println(list4.flatMap(x => List(x, x + 1)));

    //filter
    println(list4.filter(_ % 2 == 0)); // even
    println(list4.filter(x => x % 2 != 0)); // odd

    //filter even or oddd ( in range of 10)
    val evens = Seq.range(1, 10).filter(isEven(_));
    println("Even: " + evens);

    val odds = Seq.range(1, 10).filter(isOdd(_));
    println("Odd: " + odds);

    //---------------------reduce, fold or scan-------------------------- (some or none)
    val numList = List(1, 2, 3, 4);
    val nameList = List("A", "B", "C");

    //reduceLeft
    println(nameList.reduceLeft(_ + _));
    println(numList.reduceLeft(_ + _));

    // reduce Left vs Right
    println(numList.reduceLeft(_ - _));
    println(numList.reduceRight(_ - _));

    // fold left vs Right
    println(numList.foldLeft(100)(_ - _));
    println(numList.foldRight(100)(_ - _));

    // scan left vs right
    println(numList.scanLeft(100)(_ - _));
    println(numList.scanRight(100)(_ - _));

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

  // PARTIALLY APPLIED FUNCTIONS
  //log function
  def log(date: Date, message: String) = println(date + " " + message);

  // CURRYING - transform function from multiple args to function to single args
  def addTwoCurry(x: Int) = (y: Int) => x + y;

  // CURRYING - transform function from multiple args to function to single args
  def addTwoCurryII(x: Int)(y: Int) = x + y;

  //even function
  def isEven(x: Int) = x % 2 == 0;

  //odd function
  def isOdd(x: Int) = x % 2 != 0;
}
