object ArgmentApp {
  def neko(name: String = "nukocat", age: Int = 22): Unit = {
    println(s"hi! $name ($age)")
  }

  def main(args: Array[String]): Unit = {
    neko("inu", 334)
    neko("kame", 1000)
    neko()
    neko(age = 8, name = "mimi")
  }
}