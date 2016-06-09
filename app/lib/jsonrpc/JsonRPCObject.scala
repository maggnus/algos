package lib.jsonrpc

import play.api.http.{Writeable, ContentTypes, ContentTypeOf}
import play.api.libs.json.JsValue
import play.api.mvc.Codec

/**
 * Created by maggnus on 07.06.16.
 */
trait JsonRPCObject {

  def toJson: JsValue

  override val toString = toJson.toString()

}


object JsonRPCObject {

  implicit def contentTypeOf_JsonRPCObject(implicit codec: Codec): ContentTypeOf[JsonRPCObject] = {
    ContentTypeOf[JsonRPCObject](Some(ContentTypes.JSON))
  }

  implicit def writeable(implicit codec: Codec): Writeable[JsonRPCObject] = {
    Writeable(data => codec.encode(data.toString))
  }

}