package org.aganesan.scalasamples.breakandcontinue
import scala.util.control.Breaks._

//This example simulates the continue keyword in java.
object Break2 extends App {
  val searchMe = "panoramic view"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    breakable {
      if (searchMe.charAt(i) != 'a') {
        break // break out of the 'breakable', continue the outside loop
      } else {
        numPs += 1
      }
      println(s"Breakable::$i");
    }
    println(s"Forloop::$i");
  }
  println("Found " + numPs + " a's in the string.")
}