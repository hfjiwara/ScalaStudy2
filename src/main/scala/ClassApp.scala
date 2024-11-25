class ClassApp {
  val name = "nukochan"
  def neko() = println("nya-!")
}

object NekoApp {
  def main(args: Array[String]): Unit = {
    val classneko = new ClassApp
    println(classneko.name)
    classneko.neko()
    println(1111)
  }
}

object ConstApp {
  def main(args: Array[String]): Unit = {

  }
}