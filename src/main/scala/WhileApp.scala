object WhileApp{
  def main(args: Array[String]): Unit = {
    //while

    var i = 100;

//    while(i > 1) {
//      println(i)
//      i -= 1
//    }

    do {
      println(i)
      i += 1
    }
    while (i < 10)
  }
}