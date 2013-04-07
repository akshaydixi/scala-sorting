package org.github.bamos.scalasorting

import scala.collection.mutable.ArraySeq

object MergeSort {
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

  private def mergeSort(vals: ArraySeq[Int], tmp: ArraySeq[Int],
                        left: Int, right: Int) {
    if (left < right) {
      val center = (left + right)/2;
      mergeSort(vals, tmp, left, center)
      mergeSort(vals, tmp, center+1, right)
      merge(vals, tmp, left, center+1, right)
    }
  }

  private def merge(vals: ArraySeq[Int], tmp: ArraySeq[Int],
                    leftPos: Int, rightPos: Int, rightEnd: Int) {
    var leftPosVar = leftPos; var rightPosVar = rightPos;
    val leftEnd = rightPos - 1
    var rightEndVar = rightEnd
    var tmpPos = leftPos
    val numElements = rightEnd - leftPos + 1

    while (leftPosVar <= leftEnd && rightPosVar <= rightEnd) {
      if (vals(leftPosVar) <= vals(rightPosVar)) {
        tmp(tmpPos) = vals(leftPosVar)
        tmpPos += 1; leftPosVar += 1;
      } else {
        tmp(tmpPos) = vals(rightPosVar)
        tmpPos +=1; rightPosVar +=1;
      }
    }

    while (leftPosVar <= leftEnd) {
      tmp(tmpPos) = vals(leftPosVar)
      tmpPos += 1; leftPosVar += 1;
    }

    while (rightPosVar <= rightEnd) {
      tmp(tmpPos) = vals(rightPosVar)
      tmpPos += 1; rightPosVar += 1;
    }

    for (i <- 0 until numElements) {
      vals(rightEndVar) = tmp(rightEndVar)
      rightEndVar -= 1
    }
  }
}
