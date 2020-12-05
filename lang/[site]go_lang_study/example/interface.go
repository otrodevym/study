package main

type Reader interface {
	Read(p []byte) (n int, err error)
}

type Writer interface {
	Writer(p []byte) (n int, err error)
}

type ReadWriter interface {
	Reader
	Writer
}
