package main

import (
	"bytes"
	"fmt"
	"os"
	"strconv"
)

func main() {
	filename := os.Args[1]
	buffer := make([]byte, 10)
	f, err := os.Open(filename)
	if err != nil {
		panic(err)
	}
	f.Read(buffer)
	content := string(buffer[:bytes.IndexByte(buffer, 0)])
	number, _ := strconv.Atoi(content)
	fmt.Printf("%d * %d = %d\n", number, number, number*number)
	os.Exit(0)
}
