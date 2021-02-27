void main() async {
  methodA();
  await methodB();
  await methodC("C");
  methodD();
}

void methodD() {
  print('D');
}

methodC(String s) async{
  print('C start from $s');
  Future(() {
    print('C running Future from $s');
  }).then((_) => print('C end of Future from $s'));

  print('C end from $s');
}

methodB() async {
  print('B starts');
  await methodC("B");
  print('B end');
}

void methodA() {
  print("A");
}