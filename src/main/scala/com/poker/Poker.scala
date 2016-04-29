package problems.poker

import com.poker.{Card, Deck, Hand, Util}

/**
  * Created by rgn3634 on 4/20/16.
  */

class MainPoker {

  def setHandCards(card1:String, card2:String, card3:String, card4:String, card5:String): Unit ={

    val cardList = List(card1, card2, card3, card4, card5)
    val deck = new Deck()
    deck.validateCards(cardList)
    val handCardList = cardList.map(c => Card(new Util().getSuite(c), new Util().getRank(c)))
    val hand = new Hand(handCardList.groupBy(c => c.rank).mapValues(_.size), handCardList.groupBy(c => c.suite).mapValues(_.size))
    println(hand.findPokerHandType())
  }
}

object MainPoker extends App{

  val poker = new MainPoker()
  poker.setHandCards("HA","C2","C3","H4","S5")

}





