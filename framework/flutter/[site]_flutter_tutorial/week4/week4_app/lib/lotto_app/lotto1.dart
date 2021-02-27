import 'dart:math';

Set<int> lottoNumber() {
  var random = Random();
  Set<int> list = {};
  var num;

  for (int i = 0; list.length < 6; i++) {
    num = random.nextInt(45) + 1;
    list.add(num);
  }
  print('당첨번호');
  print(list.toList());

  return list;
}

Set<int> myNumber() {
  final random = Random();
  final Set<int> myList = {};
  // var num;

  // for (int i = 0; i < 6; i++) {
  //   num = random.nextInt(45) + 1;
  //   myList.add(num);
  // }
  while (myList.length != 6) {
    myList.add(random.nextInt(45) + 1);
  }

  print('내 추첨 번호');
  print(myList.toList());

  return myList;
}

void checkNumber(lottoList, myList) {
  int count = 0;
  for (int i in lottoList) {
    for (int j in myList) {
      if (i == j) {
        count++;
        print('일치하는 번호 $j');
      }
    }
  }
  print("맞은 갯수 : $count");
}

main() {
  Set<int> lottoList = lottoNumber();
  Set<int> myList = myNumber();

  checkNumber(lottoList, myList);
}
