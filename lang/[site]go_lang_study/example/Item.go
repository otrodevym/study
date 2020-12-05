package main

import "fmt"

type Item struct {
	name  string
	price string
}

// func (t Item) Cost() float64 {
// 	return t.price * float64(t.price)
// }

func (t Item) Cost() float64 {
	return t.price * t.price.(float64)
}

func main() {
	shirt := Item{name: "a", price: "2000"}
	fmt.Println(shirt.Cost())
}
