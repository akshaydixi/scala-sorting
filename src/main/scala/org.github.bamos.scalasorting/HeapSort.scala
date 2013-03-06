package org.github.bamos.scalasorting

import scala.collection.mutable.ArraySeq

object HeapSort {
    def sort(vals: ArraySeq[Int]) {
        var heap = new MaxHeap
        heap.set(vals)
        for (i <- vals.length - 1 to 0 by -1) {
            vals(i) = heap.deleteMax
        }
    }
}

class MaxHeap {
    var _vals: ArraySeq[Int] = _ // First element is in 1, not 0.

    def set(vals: ArraySeq[Int]) {
        _vals = new ArraySeq[Int](1)
        _vals(0) = 0
        _vals ++= vals.clone

        // Sift down starting at the last internal node.
        for (i <- (_vals.length-1)/2 until 0 by -1) {
            siftDown(i)
        }
    }

    def deleteMax(): Int = {
        val size = _vals.length - 1
        if (size == 0) {
            throw new RuntimeException
        }

        val maxItem = _vals(1)
        _vals(1) = _vals(size)
        siftDown(1)

        return maxItem
    }

    private def siftDown(hole: Int) {
        var holeVar = hole
        val tmp = _vals(holeVar)
        val size = _vals.length - 1

        while (holeVar * 2 <= size) {
            var child = holeVar * 2
            if (child != size &&
                    _vals(child+1) > _vals(child)) {
                child += 1
            }
            if (_vals(child) > tmp) {
                _vals(holeVar) = _vals(child)
            } else {
                _vals(holeVar) = tmp
                return;
            }
            holeVar = child
        }
        _vals(holeVar) = tmp
    }
}
