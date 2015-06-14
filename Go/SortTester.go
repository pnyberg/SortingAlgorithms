// go run SortTester.go BubbleSort.go InsertionSort.go

package main

import (
	"fmt"
)

type sortAlgorithm func([]int64)

// TODO: make a random-generated array with approx 100 digits
func testSort(sort sortAlgorithm) bool {
	// the array-keys
	arrayKey := []int64{1, 2, 3, 4, 5}
	arrayMultipleSameKey := []int64{2, 2, 3, 3, 5}

	// the arrays to be tested
	arrayInOrder := []int64{1, 2, 3, 4, 5}
	arrayReversedOrder := []int64{5, 4, 3, 2, 1}
	arrayRandomOrder := []int64{2, 4, 3, 5, 1}
	arrayMultipleSame := []int64{2, 2, 3, 5, 3}

	// test the arrays and return false if they didn't work
	sort(arrayInOrder)
	if !equals(arrayKey, arrayInOrder) {
		return false
	}

	sort(arrayReversedOrder)
	if !equals(arrayKey, arrayReversedOrder) {
		return false
	}

	sort(arrayRandomOrder)
	if !equals(arrayKey, arrayRandomOrder) {
		return false
	}

	sort(arrayMultipleSame)
	if !equals(arrayMultipleSameKey, arrayMultipleSame) {
		return false
	}

	return true
}

func equals(arr1 []int64, arr2 []int64) bool {
	if len(arr1) != len(arr2) {
		return false
	}

	for i := range arr1 {
		if arr1[i] != arr2[i] {
			return false
		}
	}
	return true
}

// prints out the array in order
func print(array []int64) {
	for _, i := range array {
		fmt.Println(i)
	}
}

// this functions is used to prove that my testcode
//  does in fact work
func notWorkingSort(array []int64) {
	// does nothing
}

// the engine of the program
func main() {
	fmt.Println("Does my BubbleSort work: ", testSort(bubbleSort))
	fmt.Println("Does my InsertionSort work: ", testSort(insertionSort))
	fmt.Println("Does my testSort-code work: ", !testSort(notWorkingSort))
}
