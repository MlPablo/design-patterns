package task31

import (
	"fmt"
	"math"
)

type IClone interface {
	clone() IEquation
}

type IEquation interface {
	solve() []float64
	getCoefficients() []float64
	IClone
}

type Equation struct {
	Coefficients []float64
}

func NewEquation(coefficients []float64) IEquation {
	return &Equation{Coefficients: coefficients}
}

func (eq *Equation) solve() []float64 {
	b := eq.Coefficients[0]
	c := eq.Coefficients[1]

	if b == 0 {
		return nil
	}

	x := -c / b
	return []float64{x}
}

func (eq *Equation) getCoefficients() []float64 {
	return eq.Coefficients
}

func (eq *Equation) clone() IEquation {
	coefs := make([]float64, len(eq.Coefficients))
	copy(coefs, eq.Coefficients)
	return &Equation{Coefficients: coefs}
}

type QuadraticEquation struct {
	*Equation
}

func NewQuadraticEquation(coefficients []float64) IEquation {
	return &QuadraticEquation{&Equation{coefficients}}
}

func (eq *QuadraticEquation) solve() []float64 {
	a := eq.Coefficients[0]
	b := eq.Coefficients[1]
	c := eq.Coefficients[2]

	if a == 0 {
		if b == 0 {
			return nil
		}
		return []float64{-c / b}
	}

	discriminant := b*b - 4*a*c

	if discriminant < 0 {
		return nil
	} else if discriminant == 0 {
		x := -b / (2 * a)
		return []float64{x}
	} else {
		x1 := (-b + math.Sqrt(discriminant)) / (2 * a)
		x2 := (-b - math.Sqrt(discriminant)) / (2 * a)
		return []float64{x1, x2}
	}
}

type BiQuadraticEquation struct {
	*Equation
}

func NewBiQuadraticEquation(coefficients []float64) IEquation {
	return &BiQuadraticEquation{&Equation{coefficients}}
}

func (eq *BiQuadraticEquation) solve() []float64 {
	a := eq.Coefficients[0]
	b := eq.Coefficients[2]
	c := eq.Coefficients[4]

	discriminant := b*b - 4*a*c

	res := []float64{}

	if discriminant < 0 {
		return nil
	} else if discriminant == 0 {
		x := -b / (2 * a)
		if x > 0 {
			res = append(res, math.Sqrt(x), -math.Sqrt(x))
		} else if x == 0 {
			res = append(res, 0)
		}

	} else {
		x1 := (-b + math.Sqrt(discriminant)) / (2 * a)
		x2 := (-b - math.Sqrt(discriminant)) / (2 * a)
		if x1 > 0 {
			res = append(res, math.Sqrt(x1), -math.Sqrt(x1))
		} else if x1 == 0 {
			res = append(res, 0)
		}
		if x2 >= 0 {
			res = append(res, math.Sqrt(x2), -math.Sqrt(x2))
		} else if x2 == 0 {
			res = append(res, 0)
		}
	}
	return res
}

func Main() {
	eq := NewQuadraticEquation([]float64{3, 2, 1})
	eqClone := eq.clone()
	fmt.Println(eqClone.getCoefficients())
}
