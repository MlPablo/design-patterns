package task32

import "fmt"

func Main() {
	jpegOpener := &JpegOpener{}
	pngOpener := &PngOpener{}
	docOpener := &DocOpener{}
	xlsOpener := &XlsOpener{}
	pptOpener := &PptOpener{}
	pdfOpener := &PdfOpener{}

	pdfOpener.setNext(pptOpener)
	pptOpener.setNext(xlsOpener)
	xlsOpener.setNext(docOpener)
	docOpener.setNext(pngOpener)
	pngOpener.setNext(jpegOpener)

	files := []string{
		"image.jpg",
		"image.png",
		"document.docx",
		"document.doc",
		"table.xls",
		"table.xlsx",
		"presentation.pptx",
		"document.pdf",
	}
	for _, file := range files {
		fmt.Println(pdfOpener.openFile(file))
	}
}
