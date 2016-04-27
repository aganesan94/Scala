package org.aganesan.scalasamples.breakandcontinue
import scala.util.control._

//This example simulates the continue keyword in java.
object Break3 extends App {

   val Inner = new Breaks
    val Outer = new Breaks
    Outer.breakable {
        for (i <- 1 to 5) {
            Inner.breakable {
                for (j <- 'a' to 'e') {
                    if (i == 1 && j == 'c') Inner.break else println(s"i: $i, j: $j")
                    if (i == 2 && j == 'b') Outer.break
                }
            }
        }
   }
}