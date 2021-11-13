object New3Features {

  // 1 ----- literal types
  val aNumber = 3;
  val three: 3 = 3; // of type 3

  def pasStrict(n: 3): Unit = println(n);
  pasStrict(three);
//  pasStrict(1); // not gonna work


  // 2 ------ union types
//  def ambivalentMethod(arg: String | Int): Any = arg match {
//    case _: String => println("string");
//    case _: Int    => println("int");
//  }

  def main(args: Array[String]): Unit = {
//    ambivalentMethod(42);
//    ambivalentMethod("jojoe");
  }
}
