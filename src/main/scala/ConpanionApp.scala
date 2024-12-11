class ConpanionApp {


}

class neko3(val name:String, val age: Int, val weight:Int) {
  def getDetails: String= s"nekoname: $name, $age, $weight"
}

object neko3 {
  //コンパニオンオブジェクト
  def applu(name:String, age:Int, weight:Int): Unit = {
 new neko3(name, age, weight)
  }

  //デフォルトのメゾっど
  def defaultMethod: neko3 = {
    new neko3("nemu". 1. 2)
  }
}