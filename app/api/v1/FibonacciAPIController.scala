package api.v1

import javax.inject._
import lib.math.fibonacci.FibonacciAlgo
import play.api._
import play.api.libs.json._
import play.api.mvc._
import lib.jsonrpc.JsonRPCError

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
class FibonacciAPIController extends Controller {

  import FibonacciAlgo._

  def index(method: String, req: String) = Action {
    try {
      val result: List[JsValue] = req.split(",").map(_.split("-").map(_.toInt).toList).collect {
        case List(a) => Json.toJson(FibonacciAlgo(a, method))
        case List(a, b) => Json.toJson(FibonacciAlgo(a, b, method))
      }.toList
      Ok(Json.toJson(result))
    } catch {
      case e: Exception =>
        e.printStackTrace()
        NotFound(JsonRPCError(101, e.getMessage))
    }
  }

}

