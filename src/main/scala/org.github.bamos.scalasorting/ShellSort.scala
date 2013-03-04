package org.github.bamos.scalasorting

import scala.collection.mutable.ArraySeq

object ShellSort {
    def sort(vals: ArraySeq[Int]) {
        // Marcin Ciura's gap sequence.
        val gaps = Array(701, 301, 132, 57, 23, 10, 4, 1)

        for (gap <- gaps) {
            for (i <- gap until vals.length) {
                val temp = vals(i)
                var j = i
                while (j >= gap && temp < vals(j-gap) ) {
                    vals(j) = vals(j-gap)
                    j -= gap
                }
                vals(j) = temp;
            }
        }
    }
}
