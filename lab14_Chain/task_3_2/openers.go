package task32

import (
	"strings"
)

type JpegOpener struct {
	next Chain
}

func (j *JpegOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "jpg" {
		if j.next != nil {
			return j.next.openFile(file)
		}
		return ""
	}

	return "jpeg content"
}

func (j *JpegOpener) setNext(c Chain) {
	j.next = c
}

type PngOpener struct {
	next Chain
}

func (p *PngOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "png" {
		if p.next != nil {
			return p.next.openFile(file)
		}
		return ""
	}

	return "png content"
}

func (p *PngOpener) setNext(c Chain) {
	p.next = c
}

type DocOpener struct {
	next Chain
}

func (d *DocOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "doc" && format != "docx" {
		if d.next != nil {
			return d.next.openFile(file)
		}
		return ""
	}

	return "doc content"
}

func (d *DocOpener) setNext(c Chain) {
	d.next = c
}

type XlsOpener struct {
	next Chain
}

func (x *XlsOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "xls" && format != "xlsx" {
		if x.next != nil {
			return x.next.openFile(file)
		}
		return ""
	}

	return "excel content"
}

func (x *XlsOpener) setNext(c Chain) {
	x.next = c
}

type PptOpener struct {
	next Chain
}

func (p *PptOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "pptx" && format != "ppt" {
		if p.next != nil {
			return p.next.openFile(file)
		}
		return ""
	}

	return "power point content"
}

func (p *PptOpener) setNext(c Chain) {
	p.next = c
}

type PdfOpener struct {
	next Chain
}

func (p *PdfOpener) openFile(file string) string {
	words := strings.Split(file, ".")
	format := words[1]
	if format != "pdf" {
		if p.next != nil {
			return p.next.openFile(file)
		}
		return ""
	}

	return "pdf content"
}

func (p *PdfOpener) setNext(c Chain) {
	p.next = c
}
