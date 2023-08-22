package task32

type Operation interface {
	count(a, b int) int
}

type PlusStrategy struct {
}

func (PlusStrategy) count(a, b int) int {
	return a + b
}

type MinusStrategy struct {
}

func (MinusStrategy) count(a, b int) int {
	return a - b
}

type MultiplyStrategy struct {
}

func (MultiplyStrategy) count(a, b int) int {
	return a * b
}
