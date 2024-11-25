object IfElseApp {
  def main(args: Array[String]): Unit = {
    //実践scala p28〜

    //    //そのまま
    //    var weight: Int = 120
    //    var message: String = null
    //    if(weight <= 100) {
    //      message = "OK"
    //    } else {
    //      message = "NO!"
    //    }

    // Scalaらしく
    var weight = 120
    var message = if (weight <= 100) {
      "OK"
    } else {
      "NO"
    }
    println(message)
  }


}