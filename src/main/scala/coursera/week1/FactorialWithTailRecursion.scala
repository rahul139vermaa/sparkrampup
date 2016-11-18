package coursera.week1

import scala.annotation.tailrec

/**
  * Created by rahul on 12/11/16.
  */
object FactorialWithTailRecursion extends App{
  @tailrec
    def fact(x:Double, res:Double=1):Double=if(x==0) res else fact(x-1,res*x)

  println(fact(5))
  /*fact(4,5)
  fact(3,20)
  fact(2,60)
  fact(1,120)
  fact(0,120)*/

}
