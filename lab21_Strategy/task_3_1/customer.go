package task31

type Customer struct {
	payment PaymentMethod
}

func NewCustomer(p PaymentMethod) *Customer {
	return &Customer{
		payment: p,
	}
}

func (c *Customer) setPayment(p PaymentMethod) {
	c.payment = p
}

func (c *Customer) pay(amount int) {
	c.payment.pay(c, amount)
}
