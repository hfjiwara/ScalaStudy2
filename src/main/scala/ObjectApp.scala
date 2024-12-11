class ObjectApp(val x: Int, val y: Int) {

  override def toString: String = s"ObjectApp(x=$x, y=$y)"
}

object ObjPoint {
  def apply(x: Int, y: Int): ObjectApp = new ObjectApp(x, y)
}

object Main {
  def main(args: Array[String]): Unit = {
    var p = ObjPoint(33,4)
    println(p)
  }
}