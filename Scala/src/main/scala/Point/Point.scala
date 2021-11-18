package Point

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy:Int): Unit ={
    x = x +dx
    y = y + dy
    println("Point x location: " + x)
    println("Point y location: " + y)
  }
}

class Person(val first: String = "John", val last: String = "Doe")


object Demo {
 def main(args: Array[String]): Unit ={
   val pt = new Point(10,20);

   // move to new location
   pt.move(10,10);

   // test Person
   val p1 = new Person();
   print(p1.first)


 }
}
