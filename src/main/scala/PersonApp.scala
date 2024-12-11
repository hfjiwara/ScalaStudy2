import PersonApp.printWeight

class PersonApp(name: String, age: Int, private val weight: Int) {
  def getName :String= name
  def getWeight = weight
}
object PersonApp {
  def printWeight(name: String , age:Int, String:Int): Unit = {
    val mimi = new PersonApp(name, age, String)
    println(s"${mimi.getName}'s weight: ${mimi.getWeight}")
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val p = printWeight("mizu", 1, 2)

    println(p)


  }
}
