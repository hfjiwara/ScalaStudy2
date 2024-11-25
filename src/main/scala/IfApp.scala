object IfApp{
  def main(args: Array[String]): Unit = {
    val score = 30




    val result = {
      if(score > 50) "yeah"
      else if (score > 70) "omg"
      else "> <"
    }
    println(result)
  }
}