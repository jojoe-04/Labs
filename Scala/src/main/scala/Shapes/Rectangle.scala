package Shapes


// Inherit from Polygon
class Rectangle(var width: Int, var height: Int) extends Polygon with Shape {
  override def areaV2 : Double = width * height;
  def color: String = "red";

}
