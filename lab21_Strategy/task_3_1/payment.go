package task31

import "fmt"

type PaymentMethod interface {
	pay(c *Customer, amount int)
}

type BankAccount struct {
}

func (BankAccount) pay(c *Customer, amount int) {
	fmt.Printf("Payment of $%v made from bank account.\n", amount)
}

type PayPalAccount struct {
}

func (PayPalAccount) pay(c *Customer, amount int) {
	fmt.Printf("Payment of $%v made from paypal account.\n", amount)
}
