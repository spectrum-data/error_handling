package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	filename := os.Args[1]
	buffer := make([]byte, 10)
	f, _ := os.Open(filename)
	size, _ := f.Read(buffer)
	content := string(buffer[:size])
	number, _ := strconv.Atoi(content)
	fmt.Printf("%d * %d = %d\n", number, number, number*number)
	os.Exit(0)
}
