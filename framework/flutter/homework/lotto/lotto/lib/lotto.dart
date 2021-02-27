import 'dart:math';


void main() {
  Set<int> numSet = new Set();
  Random r = new Random();
  for (int i = 0; numSet.length < 7; i++ ) {
    numSet.add(r.nextInt(10) + 1);
  }
  numSet.forEach((element) {print(element);});

}
//
// 자기화면을 공유해서 소스를 공유했습니다
//
// demo
//
