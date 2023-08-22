package task32

import (
	"fmt"
)

type PrintableString struct {
	base string
}

func NewPrintableString(b string) PrintableString {
	return PrintableString{b}
}

func (p PrintableString) print() {
	fmt.Println(p.base)
}

func Main() {
	hello := NewPrintableString("Hello, World!")
	hello.print()

	PostComaDecorator{pst: hello}.print()
	PostEndlDecorator{pst: hello}.print()
	PostSpaceDecorator{pst: hello}.print()
	PostExclaimDecorator{pst: hello}.print()
	PostWordDecorator{pst: hello, word: " too all"}.print()
	PreWordDecorator{pst: hello, word: "and "}.print()
}
