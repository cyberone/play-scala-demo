package model

import play.api.libs.json.{JsObject, JsString, JsValue}

case class Event(jsValue: JsValue) {
  def img: JsValue = jsValue.as[JsObject].value("photo_200")

  def name(): JsValue = jsValue.as[JsObject].value("name")

  def url: String = "https://vk.com/" + jsValue.as[JsObject].value("screen_name").asInstanceOf[JsString].value
}

object Event {
  def apply: JsValue => Event = {jsValue => new Event(jsValue)}
}