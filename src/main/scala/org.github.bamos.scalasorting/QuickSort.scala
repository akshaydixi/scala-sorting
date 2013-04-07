package org.github.bamos.scalasorting

import scala.collection.mutable.ArraySeq

object QuickSort {
  def sort(vals: ArraySeq[Int]) {
    sort(vals, 0, vals.length-1) 
  }

  private def sort(vals: ArraySeq[Int], lo: Int, hi: Int) {
    var pivotIdx = findPivot(vals, lo, hi)
    swap(vals, pivotIdx, hi)
    val mid = partition(vals, lo, hi-1, vals(hi))
    swap(vals, mid, hi)
    if ((mid-lo) > 1) sort(vals,    lo, mid-1)
    if ((hi-mid) > 1) sort(vals, mid+1,    hi)
  }

  private def findPivot(vals: ArraySeq[Int], lo: Int, hi: Int): Int = {
    return findMedian(vals, lo, (lo+hi)/2, hi)
  }
  
  private def
  findMedian(vals: ArraySeq[Int], lo: Int, mid: Int, hi: Int): Int = {
    val loVal = vals(lo); val midVal = vals(mid); val hiVal = vals(hi);
    if (loVal > midVal) {
      if (midVal > hiVal) {
        return mid
      } else if (loVal > hiVal) {
        return hi
      } else {
        return lo
      }
    } else {
      if (loVal > hiVal) {
        return lo
      } else if (midVal > hiVal) {
        return hi
      } else {
        return mid
      }
    }
  }


  private def
  partition(vals: ArraySeq[Int], left: Int, right: Int, pivot:Int): Int = {
    var leftVar = left; var rightVar = right;
    while (leftVar <= rightVar) {
      while (vals(leftVar) < pivot) {
        leftVar = leftVar + 1
      }
      while ((rightVar >= leftVar) && (vals(rightVar) >= pivot)) {
        rightVar = rightVar - 1
      }
      if (rightVar > leftVar) {
        swap(vals, leftVar, rightVar)
      }
    }
    return leftVar
  }

  private def swap(vals: ArraySeq[Int], i: Int, j: Int) {
    val temp = vals(i)
    vals(i) = vals(j)
    vals(j) = temp
  }
}
