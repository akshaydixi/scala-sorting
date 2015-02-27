# Scala Sorting

Note: I wrote this project as an undergrad to help learn Scala and
the material in a sophomore-level data structures class.

This repository contains educational implementations of popular
sorting algorithms in Scala.
Also note that these read much like Java and don't take advantage
of Scala's functional programming features.
See the [issues list](https://github.com/bamos/scala-sorting/issues)
for improvements I'd like to make.

| Algorithms |
|---|
| Heapsort [Description](http://en.wikipedia.org/wiki/Heapsort) [Source](https://github.com/bamos/scala-sorting/blob/master/src/main/scala/org.github.bamos.scalasorting/HeapSort.scala) |
| Insertion sort [Description](http://en.wikipedia.org/wiki/Insertion_sort) [Source](https://github.com/bamos/scala-sorting/blob/master/src/main/scala/org.github.bamos.scalasorting/InsertionSort.scala) |
| Mergesort [Description](http://en.wikipedia.org/wiki/Merge_sort) [Source](https://github.com/bamos/scala-sorting/blob/master/src/main/scala/org.github.bamos.scalasorting/MergeSort.scala) |
| Quicksort [Description](http://en.wikipedia.org/wiki/Quicksort) [Source](https://github.com/bamos/scala-sorting/blob/master/src/main/scala/org.github.bamos.scalasorting/QuickSort.scala) |
| Shell sort [Description](http://en.wikipedia.org/wiki/Shell_sort) [Source](https://github.com/bamos/scala-sorting/blob/master/src/main/scala/org.github.bamos.scalasorting/ShellSort.scala) |

## Compiling

```
sbt compile
```

## Running tests

```
sbt test
```

## Further reading
+ [sbt](http://www.scala-sbt.org/)
+ [Scala](http://www.scala-lang.org/)
+ [ScalaTest](http://www.scalatest.org/)
  + [ScalaTest/JUnit](http://www.scalatest.org/getting_started_with_junit_4_in_scala)
