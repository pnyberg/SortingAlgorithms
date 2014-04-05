package main

import (
)

func bubbleSort(array []int64) {
	for i := range array {
		for n := i + 1; n < len(array); n++ {
			if array[i] > array[n] {
				temp := array[i]
				array[i] = array[n]
				array[n] = temp
			}
		}
	}
}