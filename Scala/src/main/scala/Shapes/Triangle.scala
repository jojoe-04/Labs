package Shapes

class Triangle(var width: Int, var height: Int) extends Polygon {
  override def areaV2: Double = width * height / 2;

}
