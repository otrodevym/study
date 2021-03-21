import 'dart:io';
void main() {
  var line = stdin.readLineSync();
  int num = int.parse(line);
  print(num);


  int count = 0;
  int checkNum = 0;
  print(num % 10);
  for(int i = 0; i < num; i++) { // 일의 자리
    checkNum = i % 10;
    print("checkNum : $checkNum");

    if(checkNum == 3 || checkNum == 6 || checkNum == 9) {
      count++;
    }
  }

  print('==========');
  print("count : $count");

  print("Hello Goorm! Your input is "+line);
}