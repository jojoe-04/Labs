package Shapes



//traits
trait Shape{
  def color: String;
}



// Parent Class
abstract class Polygon {
//  def area(x: Int, y: Int): Int = x * y;
  def areaV2: Double = 0.0;
}

object Polygon {
  def main(args: Array[String]): Unit = {
//    var poly1 = new Polygon; // polygon object // changed class to polygon
//    printArea(poly1);

    var rect1 = new Rectangle(20,40); // rectangle object
    printArea(rect1);
    println(rect1.color);

    var triangle1 = new Triangle(20, 40); // triangle Object
    printArea(triangle1);
  }

  def printArea(p: Polygon): Unit = println(p.areaV2);
}