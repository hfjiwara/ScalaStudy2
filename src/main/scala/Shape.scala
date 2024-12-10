import java.util.function.DoubleUnaryOperator

abstract class Shape {
  def area: Double //  抽象めそっぞ
}

class Rectangle(var w: Int, var h: Int) extends Shape {
  //  areaをオーバーライド
  override def area: Double = w * h
}

class Circle(var x: Int) extends Shape {

  val pi = 3.14

  override def area: Double = x * x * pi
  //  math.piでもいいらしい
}

object Shape {
  def main(args: Array[String]): Unit = {

    var shape1: Shape = new Rectangle(10, 20)
    println(shape1.area)

    var shape2: Shape = new Circle(2)
    print(shape2.area)
  }
}