object MatchApp2 {
  def main(args: Array[String]): Unit = {
    val pita = for {
      i <- 1 to 1000
      j <- 1 to 1000
      k <- 1 to 1000
      if (i * i == j * j + k * k)
    } yield (i, j, k)
    //ここで、yieldによりfor文の中身をpitaに格納
    println(pita)
  }
}