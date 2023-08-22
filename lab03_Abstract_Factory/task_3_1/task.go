package task31

import (
	"fmt"
	"math/rand"
)

func getMachine(machine string) (ICoffeeMachine, error) {
	if machine == "Delongi" {
		return &Delongi{}, nil
	}
	if machine == "Mania" {
		return &Mania{}, nil
	}

	return nil, fmt.Errorf("Wrong coffee type passed")
}

func Main() {
	delongi, _ := getMachine("Delongi")
	mania, _ := getMachine("Mania")
	earned1, earned2 := simulateWork(delongi, mania, 100)
	fmt.Printf("Total money earned by delongi: %v, earned by mania: %v", earned1, earned2)
}

func simulateWork(m1, m2 ICoffeeMachine, duration int) (int, int) {
	earnedBy1 := 0
	earnedBy2 := 0
	drinks := []string{"Latte", "Cappuccino", "Americano", "Latte"}
	for i := 0; i < duration; i++ {
		drink := drinks[rand.Intn(len(drinks))]
		order1, _ := m1.makeCoffee(drink)
		order2, _ := m2.makeCoffee(drink)
		earnedBy1 += CountCleanMoney(order1)
		earnedBy2 += CountCleanMoney(order2)
	}
	return earnedBy1, earnedBy2
}

func CountCleanMoney(c ICoffee) int {
	return c.GetSellPrice() - c.GetSelfPrice()
}
