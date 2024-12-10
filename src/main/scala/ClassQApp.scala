class ClassQApp(val x: Int, val y: Int, val z: Int) {
}
object ClassQApp {
  def main(args: Array[String]): Unit = {
    val p = new ClassQApp(10, 20, 30)
    println(p.x)
    println(p.y)
    println(p.z)

  }

}