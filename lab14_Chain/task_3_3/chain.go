package task32

type Chain interface {
	Calculator
	setNext(chain Chain)
}

type Calculator interface {
	calculate(a, b int, operation string) int
}
