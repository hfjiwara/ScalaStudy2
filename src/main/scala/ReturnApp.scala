object ReturnApp {
  def main(args: Array[String]): Unit = {
    val a1: Array[String] = Array("0", "1", "2", "3", "4", "neko")
    val a2 = "neko"
    val index = indexOf(a1, a2)
    println(s"Index of '$a2' :$index")
  }

  def indexOf(array: Array[String], target: String): Int = {
   var i = 0
    while(i < array.length) {
      if(array(i) == target) return i
      i += 1
    }
    -1
  }
}