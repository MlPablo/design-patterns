package task31

func Main() {
	payPal := PayPalAccount{}
	bank := BankAccount{}

	customer := NewCustomer(payPal)
	customer.pay(10)

	customer.setPayment(bank)
	customer.pay(100)
}
