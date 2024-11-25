import java.util.Locale

object PaternApp {
  def main(args: Array[String]): Unit = {
    //    val nekoObj: AnyRef = "String Literal"
    //    nekoObj match {
    //      case v:java.lang.Integer =>
    //        println("Integer desu!")
    //      case v:String =>
    //        println(v.toUpperCase(Locale.ENGLISH))
    //    }
    //  }

    val nekoObj2: Any = List("nekokko") //matchで型の区別は不可能
    nekoObj2 match {
      case v: List[?] => println("List[?]")
      case v: List[Int] => println("Int!")
      case v: List[String] => println("String!")
      case v: List[?] => println("?")
    }
  }
}