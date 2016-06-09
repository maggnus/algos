package lib.jsonrpc

import play.api.http.{ContentTypes, ContentTypeOf, Writeable}
import play.api.libs.json.{JsValue, Writes, Json}

import play.api.mvc.Codec

/**
 * Created by maggnus on 06.06.16.
 */
case class JsonRPCError(code: Int, message: String) extends JsonRPCObject {

  def toJson = Json.obj(
    "error" ->
      Json.obj(
        "code" -> code,
        "message" -> message
      )
  )

}
