package task21

import (
	"fmt"
	"math/rand"
	"time"
)

type Vechile interface {
	runTask() string
	getType() string
}

type Car struct{}

func (c Car) runTask() string {
	return "driving car"
}

func (c Car) getType() string {
	return "car"
}

type Truck struct{}

func (t Truck) runTask() string {
	return "driving truck"
}

func (t Truck) getType() string {
	return "Truck"
}

type TrafficSimulator struct{}

func (t TrafficSimulator) createRandomCar() Vechile {
	rand.Seed(time.Now().Unix())
	v := rand.Intn(2)
	switch v {
	case 0:
		return Car{}
	case 1:
		return Truck{}
	default:
		return Truck{}
	}
}

func Main() {
	simulator := TrafficSimulator{}
	vechile := simulator.createRandomCar()

	fmt.Println(vechile.runTask(), vechile.getType())
}
