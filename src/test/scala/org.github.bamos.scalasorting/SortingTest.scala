package org.github.bamos.scalasorting

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.junit.After

import scala.collection.mutable.ArraySeq

object SortingTest {
    private var unsortedList: ArraySeq[Int] = _
    private var sortedList: ArraySeq[Int]   = _
    private var emptyList: ArraySeq[Int]     = _
}

class SortingTest extends AssertionsForJUnit {
    @Before def initialize {
        SortingTest.unsortedList = ArraySeq(3, 2, 5, 4, 1, 8, 6, 7, 9, 10)
        SortingTest.sortedList   = ArraySeq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        SortingTest.emptyList = ArraySeq()
    }

    @Test def testInsertionSort { testSort(InsertionSort.sort) }
    @Test def testHeapSort      { testSort(HeapSort.sort) }
    @Test def testMergeSort     { testSort(MergeSort.sort) }
    @Test def testShellSort     { testSort(ShellSort.sort) }
    @Test def testQuicksort     { testSort(QuickSort.sort) }

    @Test def testHeap {
        var heap = new MaxHeap()
        heap.set(SortingTest.unsortedList)
        val heapList = ArraySeq(0, 10, 9, 8, 7, 2, 5, 6, 3, 4, 1)
        assertEquals(heapList, heap._vals)
        assertEquals(10, heap.deleteMax)
        assertEquals(9, heap.deleteMax)
    }
    

    private def testSort(sortAlgorithm: (ArraySeq[Int]) => Unit) {
        sortAlgorithm(SortingTest.unsortedList)
        assertEquals(SortingTest.sortedList, SortingTest.unsortedList)
        assertEquals(ArraySeq(), SortingTest.emptyList)
    }

    private def printArraySeq(arraySeq: ArraySeq[Int]) {
        print("{")
        print(arraySeq.mkString(", "))
        print("}\n")
    }
}
