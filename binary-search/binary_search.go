package main

import "fmt"

func rank(key int, a []int) int {
	lo := 0
	hi := len(a) - 1
	for lo <= hi {
		mid := lo + (hi - lo)/2
		if key < a[mid]{
			hi = mid -1
		} else if key > a[mid]{
            lo = mid +1
		} else {
			return mid
		}
	}
	return -1
}

func main() {
	var whitelist = []int {1, 2, 3, 4, 5, 6, 7}
	var input = []int {4, 5, 7, 8, 10, 9}

	for i := 0; i < len(input); i++ {
		if rank(input[i], whitelist) < 0{
			fmt.Printf("output: %d\n", input[i])
		}
	}
}