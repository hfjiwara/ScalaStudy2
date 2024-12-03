class ClassApp3(val x: Int, val y: Int) {
  def +(p: ClassApp3): ClassApp3 = {
    new ClassApp3(x + p.x, y + p.y)
  }

  override def toString: String = "(" + x + ", " + y + ")"
  //  オーバーライドしないとハッシュが帰るだけ
}

object ClassApp3 {
  def main(args: Array[String]): Unit = {

    val p1 = new ClassApp3(1, 1)

    val p2 = new ClassApp3(2, 2)

    val p3 = new ClassApp3(3, 3)

    println(p1)

    println(p1 + p2)

    println(p1 + p2 + p3)
  }
}