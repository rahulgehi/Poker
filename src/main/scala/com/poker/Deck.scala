package com.poker

/**
  * Created by rgn3634 on 4/28/16.
  */
class Deck {

  val rankList = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A")

  val suiteList = List("H", "D", "S", "C")

  val deckCardList = for (rank <- rankList; suite <- suiteList) yield suite + rank

  def validateCards(cardList : List[String]): Unit ={

    if(!cardExists(cardList)) throw new IllegalArgumentException("Invalid card found")
    if(isDuplicateCard(cardList)) throw new IllegalArgumentException("Duplicate card found")
  }

  def cardExists(cardList : List[String]): Boolean ={
    cardList.forall(c => if (deckCardList.contains(c)) true else false)
  }

  def isDuplicateCard(cardList : List[String]): Boolean ={
    cardList.toSet.size != 5
  }
}
