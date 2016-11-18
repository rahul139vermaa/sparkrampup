package coursera.week1

/**
  * Created by rahul on 12/11/16.
  */
object SqrtStuff extends App{


  def abs(x:Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) = abs(guess*guess-x)/x < 0.00001


    def improve(guess: Double) =(guess + x / guess) / 2

    sqrtIter(1.0)
  }


  val s=sqrt(1.0e-20)
  println (s)
  println(s * s)
}
