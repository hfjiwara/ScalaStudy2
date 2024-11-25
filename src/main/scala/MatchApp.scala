object MatchApp {
//  def main(args: Array[String]): Unit = {
//    // matchとは？
//    var signal = "pick"
//
//    signal = "yellow"
//
//    val result = signal match {
//      case "red" => "stop"v   
//      case "blue" | "green" => "go"
//      case "yellow" => "caution"
//      // default ?
//      // case _ => "wrong signal"
//      case other => s"wrong signal: ${other}"
//    }
//    println(result)
//  }
  def main(args: Array[String]): Unit = {

    val nekoCat: String = "nekoCat"

    nekoCat match {
      case "nekoCat" => true
      case "inuDog" => false
    }

    val neko: Int = 1
    neko match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other" // ワイルドカード
    }

//    val lst: List[String] = List("A", "B", "C")
//    lst match {
//      case List("A", b, c) if b != "B" =>
//        println("b = " + b)
//        println("c = " + c)
//      case _ =>
//        println("nothing")
//    }

    val lst3: List[String] = List("A", "B", "C")
    lst3 match {
      case "A" :: b :: c :: _ =>
        println(s"b = $b")
        println(s"c = $c")
      case _ =>
        println("nothing")
    }

//    val lst2 = List(List("A"), List("B", "C"))
//    lst2 match {
//      case List(a@List("A"), b) =>
//        println(a)
//        println(b)
//      case _ => println("nothing")
//    }

    //error
//    (List("a"): Any) match {
//      case List(a) | Some(a) =>
//        println(a)
//    }

//    (List("a"): Any) match {
//      case List(_) | Some(_) =>
//        println("ok")
//    }

  }
}
