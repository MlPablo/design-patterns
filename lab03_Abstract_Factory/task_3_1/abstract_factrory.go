package task31

type ICoffeeMachine interface {
	makeCoffee(coffeeType string) (ICoffee, error)
}

type ICoffee interface {
	GetSelfPrice() int
	GetSellPrice() int
}

type Coffee struct {
	Name         string
	MilkAmount   int
	CoffeeAmount int
}

func (c Coffee) GetSelfPrice() int {
	return c.MilkAmount*10 + c.CoffeeAmount*5
}

func (c Coffee) GetSellPrice() int {
	return c.GetSelfPrice() * 2
}
