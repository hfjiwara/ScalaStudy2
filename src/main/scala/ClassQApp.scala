class ClassQApp(val x: Int, val y: Int, val z: Int) {
  def +(p: ClassQApp: ClassQApp = {
    new ClassQApp(x + p.x, y + p.y + z + p.z)
  }

  override def toString() = String = "(" + x + ", " + y + ", " + z + ")"

}

object ClassQApp {}

def main(args: Array[String]): Unit = {

  var pre = new ClassQApp()



}

