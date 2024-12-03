class AddApp {
  def add(x: Int)(y: Int): Int = x + y

  def add2(x: Int)(y: Int): Int = x * 2 + y * 2

  //単数の場合
  def singleAdd(x:Int, y:Int):Int = x+ y
}


object AddApp {
  def main(args: Array[String]): Unit = {

    val adder = new AddApp()
    var nuko = adder.add(2)(3)
    println(nuko)
    nuko = adder.add2(2)(3)
    println(nuko)

    val kome = adder.add(3) _
    println(kome(3))

    println()
    val singleNuko = adder.singleAdd(2, 3)
    println(singleNuko)
    val singleNuko2: Int => Int = adder.singleAdd(2, _)
    print(singleNuko2(3))

  }
}
