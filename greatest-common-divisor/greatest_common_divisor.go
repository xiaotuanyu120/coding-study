package main

import "fmt"

func GreatestCommonDivisor(p int, q int) int {
	if q == 0 {
		return p
	}
	r := p % q
	return GreatestCommonDivisor(q, r)
}

func main() {
    fmt.Println(GreatestCommonDivisor(8, 4))
}