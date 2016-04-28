package org.aganesan.scalasamples.ifselses

object TernaryOperators extends App {

  val name = "hello";

  // notice that if else statement can be assigned to a variable.
  val resultOfIf = if (name.equals("hello")) 1 else 0;
  println(resultOfIf);

  //notice the addition of an if statement inside the println
  println(if (name.indexOf("h") > -1) 1 else 0);

}