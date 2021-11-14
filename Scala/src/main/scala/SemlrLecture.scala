import scala.language.postfixOps

/* -----------NAMES------------- */
object operator extends App{
    def **(x: Int): Int = x * x;
    def ?(x: Int): Boolean = (x % 2 == 0);
    val `a.b` = 4;

    println(operator ** 2);
    println(operator ? 3);
    println(operator.`a.b`);
  }

/* -----------STRINGS------------- */
object strings extends App{
    //literals
    val str1 = "1\t2\t3";
    val str2 = """ 1\t2\t3""";
    val answer: String = "Here is the answer %f".format(2+4.0);

    //interpolation
    val a = 4;
    val b = 5;
    val str3 = s"$a + $b = ${a+b}";

    println(str1);
    println(str2);
    println(answer);
    println(str3);
  }

   /* -----------REGEX------------- */
  object regex extends App{
    val order = "A glass of beer";
    val beerMatch: Boolean = order.matches(".* beer");

    val order2 = "A glass of beer, I like beer";
    val cokeOrder: String = order2.replaceAll("[bB]eer", "coke");

    val order3 = " A bottle of Wine";
    val drink = raw".* (glass|bottle) of (beer|wine|coke).*".r
    val drink(yourAmount, yourDrink) = order;

    println(regex.cokeOrder);
    println(regex.beerMatch);

    println(yourAmount, yourDrink);
  }


/* -----------Controls If------------- */
  object controlIf extends App{

    def abs(i:Int)= if (i >= 0) i else -i; // if expression
    println(controlIf abs 1);
    println(controlIf abs -2);

    val x = 5;
    def checkEvenOdd() = if(x % 2 == 0) "Even" else "Odd";
    println(controlIf.checkEvenOdd());

  }

/* -----------Controls Match Expressions------------- */
object controlMatch extends App{
  val month = 26;
  val monthMatch = month match {
    case 1 => "January";
    case 2 => "February";
    case _ => "Oops";
  }
  println(monthMatch);


  def season(m:Int): String = m match {
    case 1 | 2 | 3 => "Winter"
    case 4 | 5 | 6 => "Spring"
    case _ => "Weird"
  }
  println(controlMatch season 1);
  println(controlMatch season 0);


  def state(i:Int) = i match {
    case i if (i < 0) => "Ice"
    case i if (i >=0 && i <= 100) => "Water"
    case _  => "Stateless"
  }

  println(controlMatch state 4);
}

/* -----------Controls While------------- */
object controlWhile extends App{
  var j = 1;
  while (j < 5) {
    if(j % 2==0) println("Even") else println("Odd");
    j+=1;
  }
}

/* -----------Controls for------------- */
object ControlFor extends App {
  for (i <- 0 until 5) println(i)
  println({1 to 5});
  1 to 5 foreach (println)
}

object OOP extends App {

  class Person (var first:String, var last:String, var age:Int){
    def this(first:String, last:String ) = this(first:String, last:String, 24);
    def isAdult(threshold:Int): Boolean = age >= threshold;
  }

  val alex = new Person("Alex", "Ark", 24);
  println(alex.first);

  // second constructor
  val alex21 = new Person("Alex", "Ark");
  println(alex21.age)

  println(alex21.isAdult(20));

  val now = new java.util.Date().toString;
  println(now);

  def nownow = new java.util.Date().toString
  println(nownow);

  lazy val you = "You";
  println(you);


  // companion object and factory
  object Person{
    def apply(first:String, last: String, age:Int) = new
    Person(first, last, age);
  }

  val joj = Person("Joj", "Doe", 21);
  println(joj.first);


  // case classes
  case class Cash(pounds:Int, pence:Int);
  val in = Cash(20,0);
  println(in);
}


object inheritance extends App{
  class Animal(var size:Int, var colour:String){
   def this() = this (0,"New");
   def move(distance:Int): Int  = distance + 1;
   def eat() = "All";
   def reproduce(): Animal = new Animal();
 }

  class Lion(var maneColour:String, s:Int, c:String ) extends Animal(s,c) {
    def roar:String = "Grrr!";
    def hunt:Int = this.size + 1;
    override def eat() = "Meat";
  }

  val lion : Animal = new Lion("Brown",87,"red");
  println(lion move 2);
}

object traits extends App{
  abstract class Animal;

  trait Swimmer {
    def swim = "splash";
  }

  trait Flyer {
    def fly = "whee";
  }

  class Bird extends Animal with Flyer;
  class Fish extends Animal with Swimmer;
  class Penguin extends Animal with Flyer with Swimmer;

  val hen = new Bird;
  val salmon = new Fish;
  val penguin = new Penguin;

  println(s"hen: ${hen.fly}");
  println(s"salmon: + ${salmon.swim}");
  println(s"Penguin: ${penguin.fly} , ${penguin.swim}");

  trait Ordered[A] extends java.lang.Comparable[A] {
    def < (that: A): Boolean = compareTo(that) < 0;
    def > (that: A): Boolean = compareTo(that) > 0;
  }
}

object PatternMatching extends App{
  def whatType(a: Any): String = {
    a match {
      case i: Int => "Int type"
      case d: Double => "Double type"
      case s: String => "String type"
      case u:java.net.URL => "Url type"
      case _ => "Something"
    }
  }

  println(PatternMatching whatType 4);
  println(PatternMatching whatType "4");
  println(PatternMatching whatType 4.0);
  println(PatternMatching whatType new java.net.URL("http://www.oamarkets.com"));
  println(whatType(2 to 5));
}

object FileMgt extends App {
  import java.io._
  var input: FileReader = _; // file reader object
  try{
    input = new FileReader("file.txt"); // read file
    println("opened");
  }
  catch{
    case fileNotFoundException: FileNotFoundException => println("No Such File Directory");
    case ioe: IOException => println(ioe.getMessage);
    case _ => println("Something Else");
  }
  finally{
    input.close();
  }
}


object Functional extends App{

  val doubleIt  = (x:Int) => x * 2;
  println(Functional doubleIt 2);

  val squareIt = (x:Int) => x * x;
  println(Functional squareIt 2);

  val doIt = (x:Int, f:(Int => Int)) => f(x); // high order functions
  println(doIt(2,doubleIt));
  println(doIt(2,squareIt));


  // passing in anonymous function
  println(doIt(2, (x=>x+1)));
  println(doIt(2, _ + 1));

  // returning functions
  val multBy = (n:Int) => ((x:Int) => x *n);
  val double = multBy(2);
  val triple = multBy(3)
  println(double(4));
  println(triple(4));

  // names function
  val username = (n:String) => ((l:String) => n + l);
  val first = username("Emmanuel");
  println(first("joj"));


  // function composition
  val f = (x:Int) => x + 2;
  val g = (x:Int) => x * 2;

  val h = f compose g;
  println(h(2));

  val u = g compose f;
  println(u(2));

  val k = f andThen g;
  println(k(2))
}


object collections extends App{
  val range1 = 1 to 5;
  range1.foreach(x => print(x +" "));
  println(range1.forall(_ < 10));
  println(range1.exists(_ == 2));


  val nameList = List("Joj","Emma","Rita")
  val upper = nameList.map(_.toUpperCase())

  val range3 = 1 to 10
  val evenOdd = range3 partition (_ % 2 == 0)



  val squares = {for (i <- 1 to 10) yield i * i }
  val squares2 = (1 to 10).map(i => i * i)

  val nestedSq = Seq(Seq(1,2,3,4,5),Seq(4,6,7,8,9))
  println(nestedSq.flatten)


  val odd1 = (1 to 10).filter(i => i % 2 != 0)
  val even1 = for(i <- 1 to 10 if( i % 2 == 0)) yield i
  val (even, odd) = (1 to 10) partition (_ % 2 == 0)


  val nestFor = for (i <- 1 to 5; j <- 5 to 6) yield i + j






}
