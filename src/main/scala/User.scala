// class User(_name: String) {
class User(val name: String) { // コンストラクタ引数をそのままフィールドにする場合にvalやvarを付けてあげる
  // val name = _name
  // def sayHi() = println("hi" + this.name)
  def sayHi() = println("hi! " + name) // どこのnameか自明の場合はthis省略可
}

object MyApp {
  def main(args: Array[String]): Unit = {
    // val tom: User = new User("tom")
    val tom = new User("tom") // インスタンス
    println(tom.name)
    tom.sayHi()
  }
}
