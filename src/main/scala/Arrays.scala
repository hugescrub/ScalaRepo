package net.hugescrub.scala

import scala.util.Sorting.quickSort

object Arrays {

    def main(args: Array[String]) {

      val notSortedArray = Array(20,10,50,40,30);
      val N:Int=0;

      println("Before sort: ")
      for ( N <- notSortedArray ) {
        println(N);
      }

      // do sorting
      quickSort(notSortedArray)

      println("After sort: ");
      for ( N <- notSortedArray ) {
        println(N);
      }

      var sum: Int=0;
      for ( N <- notSortedArray ) {
        sum+=N;
      }
      println("Sum of all array elements: "+sum);
  }
}