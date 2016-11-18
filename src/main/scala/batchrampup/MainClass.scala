package batchrampup


import java.util.Calendar
import org.apache.spark.{SparkConf, SparkContext}

import play.api.libs.json.Json
import scala.collection.mutable.ListBuffer

/**
  * Created by rahul on 11/11/16.
  */
object MainClass {

  def main(args: Array[String]) : Unit= {
    if(args.length<2) {println("please enter number of required person objects " +
      "and time to sleep after execution") ; return }
    D1.Ob1(args(0).toInt)
    Thread.sleep(2000l)
    D1.Ob2
    D2WithRDD.Ob2
    D2WithDF.Ob2
    Thread.sleep(args(1).toLong)
  }

}
