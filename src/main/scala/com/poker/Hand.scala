package com.poker

/**
  * Created by rgn3634 on 4/28/16.
  */
class Hand(val rankCount:Map[Int, Int], val suiteCount:Map[Suite.Value, Int]){


  def findPokerHandType(): String ={

    if (isFourOfKind) return "four-of-a-kind"
    if (isFullHouse)  return "full-house"
    if (isFlush) return "flush"
    if (isStraight) return "straight"
    if (isThreeOfKind) return  "three-of-a-kind"
    if (isPair) return "pair"
    "high-card"
  }

  def isFourOfKind(): Boolean = {
    rankCount.exists(x=> x._2 == 4)
  }

  def isFullHouse(): Boolean = {
    rankCount.exists(x=> x._2 == 3) && rankCount.exists(x=> x._2 == 2)
  }
  def isFlush(): Boolean = {
    suiteCount.exists(x=> x._2 == 5)
  }
  def isStraight(): Boolean = {
    if (!rankCount.exists(x=> x._2 > 1)){
      val keyList: Iterable[Int] = rankCount.filter(x=> x._2 == 1).keys
        if(keyList.max - keyList.min <= 4 || keyList.sum == 18 || keyList.sum == 50)
          return true
    }
    false
  }
  def isThreeOfKind(): Boolean = {
    println("5")
    rankCount.exists(x=> x._2 == 3)
  }
  def isTwoOfPair(): Boolean = {
    rankCount.count(x=> x._2 ==2) == 2
  }
  def isPair(): Boolean = {
    rankCount.exists(x=> x._2 == 2)
  }

}