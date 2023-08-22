package task32

import (
	"fmt"
)

type StringBuilder struct {
	value string
}

type IStringBuilder interface {
	Append(s string)
	Insert(pos int, s string)
	String() string
}

func NewStringBuilder() IStringBuilder {
	return &StringBuilder{
		value: "",
	}
}

func (sb *StringBuilder) Append(s string) {
	sb.value += s
}

func (sb *StringBuilder) Insert(pos int, s string) {
	if pos < 0 || pos > len(sb.value) {
		fmt.Println("error: invalid position for insert")
		return
	}

	leftPart := sb.value[:pos]
	rightPart := sb.value[pos:]
	sb.value = leftPart + s + rightPart
}

func (sb *StringBuilder) String() string {
	return sb.value
}

func Main() {
	stringBuilder := NewStringBuilder()
	stringBuilder.Append("some of you")
	stringBuilder.Insert(0, "not ")
	stringBuilder.Insert(4, "are ")
	fmt.Println(stringBuilder.String())
}
