object RoopApp {
  def main(args: Array[String]): Unit = {
    //seq　順序保持　<=> set 重複しない
    val filtered = Seq(1, 2, 3).filter(i => i > 3)
    println(filtered)

    val doubled = Seq(1, 2, 3).map(i => i * 2)
    println(doubled)

    //簡略化
    val doubled2 = Seq(1, 2, 3).map(_ * 2)
    println(doubled2)

    //mapの内部が複数行の場合は{}で囲む
    val doubled3 = Seq(1, 2, 3).map { i =>
      println(i)
      i * 2
    }
    println(doubled3)

    //これ、どうなっている？
    //    val doubled4 = Seq(1, 2, 3).map { i =>
    //      println(i)
    //      i * 2
    //      println(i)
    //    }
    //    println(doubled4)

    //    1
    //    1
    //    2
    //    2
    //    3
    //    3
    //    List((), (), ())
    //中でiの大きさを変えない方が良さそう

    //    flatMap わからん
    //    val flatMaps = Seq(Seq(1,2),Seq(3,4)).flatMap {
    //      s => println(s)
    //    }
    //    println(flatMaps)

    //flattenとmapの融合である　https://qiita.com/mtoyoshi/items/c95cc88de2910945c39d
    println("<------flatMap-------->")
    var neko = Seq(Seq(1, 2, 3), Seq(4), Seq(5, 6))
    println(neko)

    var nekoFlat = Seq(Seq(1, 2, 3), Seq(4), Seq(5, 6)) flatMap { x => x }
    println(nekoFlat)

    var nekoFlatten = Seq(Seq(1, 2, 3), Seq(4), Seq(5, 6)) flatMap { x => 10 +: x } //各seqに10を追加している
    println(nekoFlatten)

    val results = for {
      i <- 1 to 3
      j <- 2 to 4
      k <- 3 to 5
      result = (i * j * k) if result % 3 == 0
    } yield result
    println(results)
  }


}
