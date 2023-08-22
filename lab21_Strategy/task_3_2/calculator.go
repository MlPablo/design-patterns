package task32

type Calculator struct {
	method Operation
}

func NewCalculator(method Operation) *Calculator {
	return &Calculator{
		method: method,
	}
}

func (c *Calculator) setOperation(method Operation) {
	c.method = method
}

func (c *Calculator) calculate(a, b int) int {
	return c.method.count(a, b)
}
