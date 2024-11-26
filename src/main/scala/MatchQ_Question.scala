import java.security.SecureRandom

object MatchQ_Question {
  def main(args: Array[String]): Unit = {
    var lst = new scala.util.Random(new SecureRandom()).alphanumeric.take(5).toList
    lst match {
      case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
    }
    println(lst) //lstに格納されていない


    val lst2 = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
    case List(a,b,c,d,_) => List(a,b,c,d,a).mkString
    }
    println(lst2) //sに格納されている

    // 何でvalでいいの？
    // lst2はmatchで計算された結果が代入される(mkstring)ため
}}