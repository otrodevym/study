package main

import (
	"fmt"
	"math"
)

type Vertex struct {
	X, Y float64
}

func (v Vertex) Abs() float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

func (v *Vertex) Scale(f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

func main() {
	v := Vertex{1, 2}
	// v.X = 10
	// v.Y = 20
	t := v.Abs()
	fmt.Println(t)
	v.Scale(5)
	fmt.Println(v.X, v.Y)
}
