package org.github.bamos.scalasorting

import scala.collection.mutable.ArraySeq

object InsertionSort {
  def sort(vals: ArraySeq[Int]) {
    for (i <- 1 until vals.length) {
      val temp = vals(i)
      var j = i
      while (j > 0 && temp < vals(j-1) ) {
        vals(j) = vals(j-1)
        j -= 1
      }
      vals(j) = temp;
    }
  }
}
