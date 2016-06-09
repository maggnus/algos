package controllers

import javax.inject._

import play.api.libs.json.{JsString, Json}
import play.api.mvc._

class FibonacciController @Inject() extends Controller {

  def index = Action {
    Ok(views.html.fibonacci())
  }

}
