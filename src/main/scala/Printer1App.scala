class Printer1App {
def print(): Unit = {
  println("1")
}
}

class Printer2App extends Printer1App {
  override def print(): Unit ={
    println("2")
  }
}
