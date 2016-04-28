package org.aganesan.scalasamples.switches

object Switch1 extends App {

  val number = 3;

  number match {
    case 1 => println("1");
    case 2 => println("2");
    case 3 => println("3");
    case _ => println("default");
  }

  val match1 = number match {
    case 1 => println("1");
    case 2 => println("2");
    case 3 => println("3");
    case _ => println("default");
  }

  println(match1);

  
  
}