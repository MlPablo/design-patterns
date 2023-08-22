package task32

import "fmt"

func Main() {
	plusStrategy := PlusStrategy{}
	minusStrategy := MinusStrategy{}
	multiplyStategy := MultiplyStrategy{}

	calc := NewCalculator(plusStrategy)
	fmt.Println(calc.calculate(5, 10))

	calc.setOperation(minusStrategy)
	fmt.Println(calc.calculate(5, 10))

	calc.setOperation(multiplyStategy)
	fmt.Println(calc.calculate(5, 10))
}
