package task31

import "fmt"

type Delongi struct {
}

func (d *Delongi) makeCoffee(coffeeType string) (ICoffee, error) {
	if coffeeType == "Espresso" {
		return d.makeEspresso(), nil
	}
	if coffeeType == "Cappuccino" {
		return d.makeCappuccino(), nil
	}
	if coffeeType == "Americano" {
		return d.makeAmericano(), nil
	}
	if coffeeType == "Latte" {
		return d.makeLatte(), nil
	}
	return nil, fmt.Errorf("Wrong coffee type passed")
}

func (*Delongi) makeLatte() ICoffee {
	return Coffee{
		Name:         "Latte",
		MilkAmount:   10,
		CoffeeAmount: 5,
	}
}

func (*Delongi) makeAmericano() ICoffee {
	return Coffee{
		Name:         "Americano",
		MilkAmount:   0,
		CoffeeAmount: 10,
	}
}

func (*Delongi) makeEspresso() ICoffee {
	return Coffee{
		Name:         "Espresso",
		MilkAmount:   0,
		CoffeeAmount: 5,
	}
}

func (*Delongi) makeCappuccino() ICoffee {
	return Coffee{
		Name:         "Cappuccino",
		MilkAmount:   5,
		CoffeeAmount: 5,
	}
}
