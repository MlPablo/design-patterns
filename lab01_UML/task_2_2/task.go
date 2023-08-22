package task22

type DisplayObject interface {
	display()
}

type (
	ImageFile struct {
		BufferedImage BufferedImage
	}
)

type BufferedImage struct {
	image string
}

func (i ImageFile) display() {
	// here display logic
}

func (i ImageFile) load() BufferedImage {
	return i.BufferedImage
}

type ImageGallery struct {
	Object DisplayObject
}

func Main() {
	bufferedImage := BufferedImage{image: "sun"}
	file := ImageFile{BufferedImage: bufferedImage}

	gallery := ImageGallery{Object: file}

	gallery.Object.display()
}
