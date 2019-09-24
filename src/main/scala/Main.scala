import akka.http.scaladsl._
import akka.http.scaladsl.model._
import scala.concurrent._
import akka.actor._
import akka.stream._

object Main extends App {
  implicit val system = ActorSystem()
  implicit val mat = ActorMaterializer()
  import system.dispatcher

  while (true) {
    Http().singleRequest(HttpRequest(uri = "http://akka.io")).flatMap(_.discardEntityBytes().future)
    Thread.sleep(1000*35)
  }
}
