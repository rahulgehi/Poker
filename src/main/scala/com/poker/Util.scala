package com.poker

/**
  * Created by rgn3634 on 4/29/16.
  */

object Suite extends Enumeration{
  val HEART, DIAMOND, SPADE, CLUB = Value
}

class Util {

  def getSuite(c:String): Suite.Value ={

    c.charAt(0) match{
      case 'H' => Suite.HEART
      case 'D' => Suite.DIAMOND
      case 'S' => Suite.SPADE
      case 'C' => Suite.CLUB
    }
  }

  def getRank(c:String): Int ={

    c.charAt(1) match {
      case 'T' => 8
      case 'J' => 9
      case 'Q' => 10
      case 'K' => 11
      case 'A' => 12
      case  _  => Integer.parseInt(c.charAt(1).toString) - 2
    }
  }
}
