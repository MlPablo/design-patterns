package task31

import (
	"errors"
	"fmt"
)

type Engine struct {
	power int
}

type Wheel struct {
	radius int
}

type Car struct {
	model  string
	wheel  Wheel
	engine Engine
}

func (c Car) drive() string {
	return fmt.Sprintf("drived %v miles", c.engine.power*c.wheel.radius)
}

type CarBuilder struct{}

func (c CarBuilder) BuildCar(model string, power int, radius int) *Car {
	return &Car{model: model, engine: Engine{power: power}, wheel: Wheel{radius: radius}}
}

func NewCarBuilder() CarBuilder {
	return CarBuilder{}
}

type CarSimulator struct {
	Builder CarBuilder
	Car     *Car
}

func NewSimulator() CarSimulator {
	return CarSimulator{Builder: CarBuilder{}}
}

func (c CarSimulator) setCar(model string, power int, radius int) {
	c.Car = c.Builder.BuildCar(model, power, radius)
}

func (c CarSimulator) simulate() error {
	if c.Car == nil {
		return errors.New("no car")
	}

	c.Car.drive()
	return nil
}

func Main() {
	simulator := NewSimulator()
	simulator.setCar("mazda", 10, 15)
	if err := simulator.simulate(); err != nil {
		fmt.Println("error occurred on simulate:", err)
	}
}
