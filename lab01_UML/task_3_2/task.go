package task32

type IMobile interface {
	call()
}

type Mobile struct {
	model  string
	number string
}

func (m Mobile) call() {}

type SonyEricson struct {
	Mobile
}

func newSony() IMobile {
	return SonyEricson{
		Mobile: Mobile{
			model:  "sony",
			number: "1234",
		},
	}
}

type Nokia struct {
	Mobile
}

func newNokia() IMobile {
	return Nokia{
		Mobile: Mobile{
			model:  "nokia",
			number: "1234",
		},
	}
}

func getMobile(moblieType string) IMobile {
	switch moblieType {
	case "nokia":
		return newNokia()
	case "sony":
		return newSony()
	default:
		return newNokia()
	}
}

func Main() {
	nokia := getMobile("nokia")
	nokia.call()
}
