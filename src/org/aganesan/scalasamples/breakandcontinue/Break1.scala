package org.aganesan.scalasamples.breakandcontinue

import scala.util.control.Breaks._

//simulates the break keyword in java where the for loop is exited.
object Break1 extends App {

  breakable {
    for (i <- 1 to 10) {
      if (i > 4) {
        break;
      }
      println(i);
    }
  }

}