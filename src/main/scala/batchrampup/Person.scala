package batchrampup

import play.api.libs.json._


/**
  * Created by rahul on 11/11/16.
  */


case class Person(name: String, age: Long)

object Person{
  //implicit val write=Json.format[batchrampup.Person]
  implicit object PersonWrites extends Format[Person] {
    def writes(person: Person): JsValue = {
      val personSeq = Seq(
        "name" -> JsString(person.name),
        "age" -> JsNumber(person.age)
      )
      JsObject(personSeq)
    }
    override def reads(json: JsValue): JsResult[Person] = {
      JsSuccess(Person(json.\("name").get.as[String], json.\("age").get.as[Long]))
    }
  }
}

