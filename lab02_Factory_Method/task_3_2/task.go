package task32

import (
	"bufio"
	"errors"
	"fmt"
	"math"
	"os"
	"strconv"
	"strings"
)

type IEquation interface {
	solve() []float64
	getCoefficients() []float64
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

func getEquation(coefficients []float64) (IEquation, error) {
	if len(coefficients) == 2 {
		return NewEquation(coefficients), nil
	}
	if len(coefficients) == 3 {
		return NewQuadraticEquation(coefficients), nil
	}
	if len(coefficients) == 5 {
		return NewBiQuadraticEquation(coefficients), nil
	}
	return nil, errors.New("no such equation")
}

func solveEquationsFromFile(filename string) {
	file, err := os.Open(filename)
	if err != nil {
		fmt.Println("Error file open:", err)
		return
	}
	defer file.Close()

	equations := make([]IEquation, 0)

	scanner := bufio.NewScanner(file)
	for scanner.Scan() {
		line := scanner.Text()
		line = strings.TrimSpace(line)
		coefficientsStr := strings.Fields(line)
		fmt.Println(coefficientsStr)
		coefficients := make([]float64, len(coefficientsStr))

		for i, coefStr := range coefficientsStr {
			coef, _ := strconv.ParseFloat(coefStr, 64)
			coefficients[i] = coef
		}
		eq, err := getEquation(coefficients)
		if err != nil {
			fmt.Println("Error on get eq :", err)
			fmt.Println(coefficients)
			return
		}
		equations = append(equations, eq)
	}

	if scanner.Err() != nil {
		fmt.Println("Error on read file:", scanner.Err())
		return
	}

	for i, eq := range equations {
		solutions := eq.solve()

		fmt.Printf("Equation %d: %v\n", i+1, eq.getCoefficients())

		if solutions == nil {
			fmt.Println("No solutions")
		} else {
			fmt.Println("Розв'язки:", solutions)
		}
	}
}

func Main() {
	solveEquationsFromFile("./task_3_2/input01.txt")
	solveEquationsFromFile("./task_3_2/input02.txt")
	solveEquationsFromFile("./task_3_2/input03.txt")
}
