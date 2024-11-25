class InherApp(val name: String) {
  def nekochan() = println("nya-!" + name)
}

class AdminNekoUser(name: String, val age: Int) extends InherApp(name) {
  def sayNekochang() = println("hello! " + name + "(" + age + ")")
  override def nekochan() = println("[admin] nya-!" + name)
}

object nekoApp2 {
  def main(args: Array[String]): Unit = {
    val yui = new AdminNekoUser("reiwajc", 22)
    println(yui.name)
    println(yui.age)
    yui.nekochan()
    yui.sayNekochang()

  }
}