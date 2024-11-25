object ForApp {
  //  def main(args: Array[String]): Unit = {
  //    // for (gen) 処理
  //    // for (変数 <- data) 処理
  //    // 0 to 3, until 4
  //    // for (i <- 0 to 3) println(i)
  //    // for (i <- 0 to 3; j <- 0 to 3) println(s"$i, $j")
  //    // for (i <- 0 to 3; j <- 0 to 3 if i != j) println(s"$i, $j")
  //
  //    val result = for (i <- 0 to 3; j <- 0 to 3 if i != j) yield s"$i, $j"
  //    for (element <- result) println(element)
  //  }

  def main(args: Array[String]): Unit = {

    //    for (x <- 1 to 5; y <- 1 until 5) {
    //      //      println("x:" + x + "y:" + y)
    //      if (x == y) {
    //        println(s"neko, $x, inu, $y")
    //      }
    //    }
    for (e <- List("A", "B", "C", "D", "E")) yield {
      "Pre" + e
      //      println(e)
    }

    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000) {
      if (a * a == (b * b + c * c)) {
        println(s"a: $a, b: $b, c: $c")
      }
    }
  }
}