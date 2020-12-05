package main

import (
	"fmt"
	"net/http"
	"time"
)

func main() {
	c := make(chan string)

	go func() {
		resp, err := http.Head("https://namu.wiki")
		if err == nil {
			resp.Body.Close()
			c <- resp.Status
			return
		}
		c <- "연결 실패"
	}()

	select {
	case status := <-c:
		fmt.Println(status)
	case <-time.After(2 * time.Second):
		fmt.Println("시간 초과")
	}

}
