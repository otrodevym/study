package main

import (
	"fmt"
	"unicode/utf8"

)

func main() {

	//	len()
	var s string = "한"
	fmt.Println(len(s)) // 한글 3바이트

	var r rune = '한'
	fmt.Println(utf8.RuneLen(r)) // 한글 3 바이트

	// utf8
	var s1 string = "안녕하세요"
	fmt.Println(utf8.RuneCountInString(s1)) // 실제 길이 5

	b := []byte("안녕하세요")
	r, size := utf8.DecodeRune(b)
	fmt.Printf("%c %d \n", r, size) // "안녕하세요" 첫 글자를 디코딩하여 '안' : 3바이트

	r, size = utf8.DecodeRune(b[3:]) // "안"의 길이가 3이므로 인덱스 3부터 슬라이스를 만들어서 "녕하세요"가 된다
	fmt.Printf("%c %d \n", r, size)   // '녕' : 3 바이트
	
	r, size = utf8.DecodeLastRune(b[:len(b)-3]) // '세' 3 바이트
	fmt.Printf("%c %d \n", r, size)

	r, size = utf8.DecodeLastRune(b) // '요' : 3 바이트
	fmt.Printf("%c %d \n", r, size) 


	// slice
	ss := "Hello, world!" 
	fmt.Printf("%c \n", ss[0])
	fmt.Printf("%c \n", ss[len(ss)-1])
	// fmt.Printf("%c \n", ss[len(ss)])

	ss = "안녕하세요"
	fmt.Printf("%c\n", ss[0]) // 3바이트 중 1 바이트만 출력 되어 제대로 나오지 않음
	fmt.Printf("%c\n", ss[:3]) 
	// fmt.Printf("%c\n", ss[len(ss-1)])

	ss = "안녕하세요"
	r, size = utf8.DecodeRuneInString(ss) // utf-8 문자열의 첫글자와 바이트 수를 반환
	fmt.Printf("%c %d \n", r, size) 

	r, size = utf8.DecodeLastRuneInString(ss) // utf-8 문자열의 마지막 글자와 바이트 수를 반환
	fmt.Printf("%c %d \n", r, size)


	var b1 []byte = []byte("안녕하세요")
	fmt.Println(utf8.Valid(b1)) // true : "안녕하세요"는 utf-8이 맞으므로 true
	var b2 []byte = []byte{0xff, 0xf1}
	fmt.Println(utf8.Valid(b2)) // false : 0xff, 0xf1는 utf-8이 아니므로 false

	var r1 rune = '한'
	fmt.Println(utf8.ValidRune(r1)) // true : '한'은 utf-8이 맞으므로 true
	var r2 rune = 0x111111
	fmt.Println(utf8.ValidRune(r2)) // false : '0x111111' utf-8이 아니므로 false

	var ss1 string = "한글"
	fmt.Println(utf8.ValidString(ss1)) // true : "한글"은 utf-8이 맞으므로 true
	var ss2 string = string([]byte{0xff, 0xf1})
	fmt.Println(utf8.ValidString(ss2)) // false : []byte{0xff, 0xf1}은 utf-8이 아니므로 false
}
