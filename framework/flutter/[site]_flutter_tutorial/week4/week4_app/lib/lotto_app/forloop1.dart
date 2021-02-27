main() {
  // for(int i =0; i<6; i++ ) {
  //   print("$i 번째 실행");
  // }

  // forward(4);

  List<String> rainbow = ['빨', '주', '노', '초', '파', '남', '보'];
  for(int i = 0; i < rainbow.length; i++ ){
    print('$i' + rainbow[i]);
  }

  print('===========');

  for(String s in rainbow) {
    print(s);
  }

  print('===========');
  rainbow.forEach((element) {print(element);});



}

void forward(int move) {
  for(int i = 0; i < move; i++) {
    print('$i칸 이동했습니다.');
  }
}