object MatchListApp {
  def main(args: Array[String]): Unit = {
    val list = List(List("A"), List("B", "C"))

    list match {
      case List(a@List("A"), x) =>
        println(a)
        println(x)
      case _ => println("nothing")
    }
  }
}