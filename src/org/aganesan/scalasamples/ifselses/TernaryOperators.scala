package org.aganesan.scalasamples.ifselses

object TernaryOperators extends App {

  val name = "hello";

  val resultOfIf = if (name.equals("hello")) 1 else 0;
  println(resultOfIf);

  println(if (name.indexOf("h") > -1) 1 else 0);

}