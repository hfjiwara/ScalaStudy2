import java.security.SecureRandom
import scala.util.Random

object RandomApp{
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 1000){
    val neko = new Random(new SecureRandom()).alphanumeric.take(5).toList
    neko match {
      case List(a,b,c,d,e) if a == e =>List(a,b,c,d,e).mkString
      case _ => ""
    }
      println(neko)
  }}
}
