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


  //seq, set, mapについて
  //https://qiita.com/f81@github/items/dc79819d23ce4889d552

  var filtered = Seq(1, 2, 3).filter(i => i > 1)
  println(filtered)

  //seqはシークエンスの略 順序保持
  // List > Seq

  val numSeq = 1 :: 2 :: 3 :: Nil //List(1, 2, 3) NilはEmpty_List

  println(num.head)
  println(num.tail)
  println(num.tail.head)
  println(numSeq.tail.tail.isEmpty)
  println(numSeq.tail.tail.tail.isEmpty)

  //setは重複なし
  val numSet = Set(1, 3, 3, 2)
  println(numSet)

  //map 重複なし
  val col = Map(1 -> "red",
    2 -> "blue",
    3 -> "green",
    4 -> 334
  )
  println(col(1))
  //println(col(red)) error


  
}
