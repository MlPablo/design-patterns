package task32

type PlusCalculator struct {
	next Chain
}

func (c *PlusCalculator) calculate(a, b int, operation string) int {
	if operation != "+" {
		if c.next != nil {
			return c.next.calculate(a, b, operation)
		}
		return 0
	}

	return a + b
}

func (c *PlusCalculator) setNext(chain Chain) {
	c.next = chain
}

type MinusCalculator struct {
	next Chain
}

func (c *MinusCalculator) calculate(a, b int, operation string) int {
	if operation != "-" {
		if c.next != nil {
			return c.next.calculate(a, b, operation)
		}
		return 0
	}

	return a - b
}

func (c *MinusCalculator) setNext(chain Chain) {
	c.next = chain
}

type MultiplyCalculator struct {
	next Chain
}

func (c *MultiplyCalculator) calculate(a, b int, operation string) int {
	if operation != "*" {
		if c.next != nil {
			return c.next.calculate(a, b, operation)
		}
		return 0
	}

	return a * b
}

func (c *MultiplyCalculator) setNext(chain Chain) {
	c.next = chain
}

type DivisionCalculator struct {
	next Chain
}

func (c *DivisionCalculator) calculate(a, b int, operation string) int {
	if operation != "/" {
		if c.next != nil {
			return c.next.calculate(a, b, operation)
		}
		return 0
	}

	return a / b
}

func (c *DivisionCalculator) setNext(chain Chain) {
	c.next = chain
}
