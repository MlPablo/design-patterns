package task31

import (
	"fmt"
	"math/rand"
)

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

//----------------------

func newLatte() ICoffee {
	return Coffee{
		Name:         "Latte",
		MilkAmount:   10,
		CoffeeAmount: 5,
	}
}

func newAmericano() ICoffee {
	return Coffee{
		Name:         "Americano",
		MilkAmount:   0,
		CoffeeAmount: 10,
	}
}

func newEspresso() ICoffee {
	return Coffee{
		Name:         "Espresso",
		MilkAmount:   0,
		CoffeeAmount: 10,
	}
}

func newCappuccino() ICoffee {
	return Coffee{
		Name:         "Cappuccino",
		MilkAmount:   5,
		CoffeeAmount: 5,
	}
}

func getCoffee(coffeeType string) (ICoffee, error) {
	if coffeeType == "Espresso" {
		return newEspresso(), nil
	}
	if coffeeType == "Cappuccino" {
		return newCappuccino(), nil
	}
	if coffeeType == "Americano" {
		return newAmericano(), nil
	}
	if coffeeType == "Latte" {
		return newLatte(), nil
	}
	return nil, fmt.Errorf("Wrong coffee type passed")
}

func Main() {
	fmt.Println("Total money earned: ", simulateWork(100))
}

func simulateWork(duration int) int {
	earned := 0
	drinks := []string{"Latte", "Cappuccino", "Americano", "Latte"}
	for i := 0; i < duration; i++ {
		drink := drinks[rand.Intn(len(drinks))]
		order, _ := getCoffee(drink)
		earned += CountCleanMoney(order)
	}
	return earned
}

func CountCleanMoney(c ICoffee) int {
	return c.GetSellPrice() - c.GetSelfPrice()
}
