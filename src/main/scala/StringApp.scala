object StringApp{
  def main(args: Array[String]): Unit = {
    val name = "nukochan"
    val score = 80
    val height = 180

    println(s"name: $name, score: $score, height: $height") //stringのs ?
    println(s"name: $name, score: ${score - 10}, height: ${height - 15}")

    println(f"name: $name%10s, score: $score%10d, height: $height%10f")
    println(f"name: $name%10s, score: $score%-10d, height: $height%10f")
    println(f"name: $name%10s, score: $score%-10d, height: $height%10.2f")
    println(f"name: $name%10s, score: $score%-10d, height: $height%10.1f")
  }
}