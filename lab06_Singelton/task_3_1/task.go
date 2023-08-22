package task31

import (
	"fmt"
	"os"
	"sync"
)

type FileManager struct {
	mutex sync.Mutex
}

var instance *FileManager
var once sync.Once

func GetInstance() *FileManager {
	once.Do(
		func() {
			instance = &FileManager{}
		},
	)
	return instance
}

func (fm *FileManager) ReadFile(filename string) (string, error) {
	fm.mutex.Lock()
	defer fm.mutex.Unlock()

	data, err := os.ReadFile(filename)
	if err != nil {
		return "", err
	}

	return string(data), nil
}

func (fm *FileManager) ProcessFile(filename string) {
	content, err := fm.ReadFile(filename)
	if err != nil {
		fmt.Println("error reading file:", err)
		return
	}

	fmt.Println("File content:", content)
}

func Main() {
	fileManager1 := GetInstance()
	fileManager2 := GetInstance()

	// Обробка файлу
	fmt.Println(fileManager1 == fileManager2)
}
