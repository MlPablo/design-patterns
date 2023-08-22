package task31

import "fmt"

type Mania struct {
}

func (m *Mania) makeCoffee(coffeeType string) (ICoffee, error) {
	if coffeeType == "Espresso" {
		return m.makeEspresso(), nil
	}
	if coffeeType == "Cappuccino" {
		return m.makeCappuccino(), nil
	}
	if coffeeType == "Americano" {
		return m.makeAmericano(), nil
	}
	if coffeeType == "Latte" {
		return m.makeLatte(), nil
	}
	return nil, fmt.Errorf("Wrong coffee type passed")
}

func (*Mania) makeLatte() ICoffee {
	return Coffee{
		Name:         "Latte",
		MilkAmount:   9,
		CoffeeAmount: 6,
	}
}

func (*Mania) makeAmericano() ICoffee {
	return Coffee{
		Name:         "Americano",
		MilkAmount:   0,
		CoffeeAmount: 15,
	}
}

func (*Mania) makeEspresso() ICoffee {
	return Coffee{
		Name:         "Espresso",
		MilkAmount:   0,
		CoffeeAmount: 8,
	}
}

func (*Mania) makeCappuccino() ICoffee {
	return Coffee{
		Name:         "Cappuccino",
		MilkAmount:   4,
		CoffeeAmount: 7,
	}
}
