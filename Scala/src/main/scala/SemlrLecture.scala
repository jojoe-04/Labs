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