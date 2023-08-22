package task32

type Chain interface {
	FileOpener
	setNext(chain Chain)
}

type FileOpener interface {
	openFile(file string) string
}
