object forApp2 {
  def main(args: Array[String]): Unit = {
    //    for (x <- 1 to 10; y <- 1 until (10) if (x != y)) {
    //      println(s"x: $x, y: $y")
    //    };

    //    for (e <- List("a", "b", "c", "d", "e")) {
    //      println(e)
    //    }

    // var List = ("a", "b", "c", "d", "e")
    for (e <- List("a", "b", "c", "d", "e")) yield {
      "Pre" + e
    }
    //    for(e <- List) {
    //      println(e)
    //    }

    for {
      num1 <- List(1, 2, 3)
      num2 <- List(10, 20, 30)
      if (num2 != 2)
    } yield (num1, num2)
  }

  val num = List(1, 2, 3, 4, 5)

  val add = num.map(x => x + 1)
  val even = num.filter(a => a % 2 == 0)
  val sum = num.reduce((a, b) => a + b)

  println(s"add:$add, even:$even, sum:$sum")
}
