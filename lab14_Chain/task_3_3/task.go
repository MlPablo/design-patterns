package task32

import "fmt"

type eq struct {
	a, b     int
	operator string
}

func Main() {
	plusCalculator := &PlusCalculator{}
	minusCalculator := &MinusCalculator{}
	divCalculator := &DivisionCalculator{}
	multCalculator := &MultiplyCalculator{}

	plusCalculator.setNext(minusCalculator)
	minusCalculator.setNext(divCalculator)
	divCalculator.setNext(multCalculator)

	cal := []eq{
		{
			a:        19,
			b:        25,
			operator: "+",
		},
		{
			a:        13,
			b:        25,
			operator: "-",
		},
		{
			a:        16,
			b:        23,
			operator: "*",
		},
		{
			a:        15,
			b:        5,
			operator: "/",
		},
		{
			a:        15,
			b:        5,
			operator: "abaa",
		},
	}
	for _, c := range cal {
		fmt.Println(plusCalculator.calculate(c.a, c.b, c.operator))
	}
}
