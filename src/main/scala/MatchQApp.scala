import java.security.{SecureRandom, Security}

//new.scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList


object MatchQApp {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 1000) {
      var lst = new scala.util.Random(new SecureRandom()).alphanumeric.take(5).toList
      //      lst match {
      //        case a :: b :: c :: d :: e :: _ => {
      //          println(s"$a $b $c $d $a")
      //        }
      //      }

        //lst

      match {
        case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
      }
      println(lst)
    }
  }
}