object MatchApp3 {
  def main(args: Array[String]): Unit = {
    val cats = "nuko"

    cats match {
      case "neko" => "cat"
      case "nuko" => "cat"
      case "noko" => "deer"
      case _ => "other"
    }
    //println(cats)

    val lst = List("A", "B", "C")
    lst match {
      case List("A", a1, a2) =>
        println(s"b: $a1")
        println(s"c: $a2")
      case _ => println("nothing")
    }
    lst match {
      case List("A", a1, a2) if a1 == "a" =>
        println(s"b: $a1")
        println(s"c: $a2")
      case _ => println("nothing")
    }

    //for yield 練習

    //    if(a && b && c) {
    //      x
    //    }

//    for{
//      結果a <- 処理a
//      結果b <- 処理b
//      結果c <- 処理c
//    } yield Succsess(b).merge match {
//      case Success(b) => x(b)
//      case error:Failure => println(error)
//    }

  }
}