object PatternMatchApp {
  def main(args: Array[String]): Unit = {
    //PaternMatch わからない

    val obj: Any = List("a") //スーパータイプ
    obj match {
      // 型消去で消えてしまう
      case v: List[Int] => println("List[Int]")
      case v: List[String] => println("List[String]")
    }
    obj match {
      case v: List[_] =>
        v.headOption match {
          case Some(_: Int) => println("List[Int]")
          case Some(_: String) => println("List[String]")
    }
    }
  }
}