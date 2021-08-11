package model

import play.api.libs.json.{JsObject, JsValue}

case class Event(jsValue: JsValue) {
  def img = jsValue.as[JsObject].value("photo_200")

  def name() = jsValue.as[JsObject].value("name")
}

object Event {
  def apply: JsValue => Event = {jsValue => new Event(jsValue)}
}