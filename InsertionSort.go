package main

import (
)

func insertionSort(array []int64) {
	for n := 1; n < len(array); n++ {
		k := n
		for ; k > 0 && array[n] < array[k - 1] ; k-- {}
		element := array[n]
		for i := n; i > k; i-- {
			array[i] = array[i - 1]
		}
		array[k] = element
	}
}