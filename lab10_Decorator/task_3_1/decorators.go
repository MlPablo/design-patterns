package task32

import "fmt"

type PostComaDecorator struct {
	pst PrintableString
}

func (p PostComaDecorator) print() {
	fmt.Println(p.pst.base + ",")
}

type PostEndlDecorator struct {
	pst PrintableString
}

func (p PostEndlDecorator) print() {
	fmt.Println(p.pst.base + "\n")
}

type PostSpaceDecorator struct {
	pst PrintableString
}

func (p PostSpaceDecorator) print() {
	fmt.Println(p.pst.base + " ")
}

type PostExclaimDecorator struct {
	pst PrintableString
}

func (p PostExclaimDecorator) print() {
	fmt.Println(p.pst.base + "!")
}

type PostWordDecorator struct {
	pst  PrintableString
	word string
}

func (p PostWordDecorator) print() {
	fmt.Println(p.pst.base + p.word)
}

type PreWordDecorator struct {
	pst  PrintableString
	word string
}

func (p PreWordDecorator) print() {
	fmt.Println(p.word + p.pst.base)
}
