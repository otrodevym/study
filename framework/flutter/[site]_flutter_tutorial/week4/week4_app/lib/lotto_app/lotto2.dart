main() {
  var test = List<int>.generate(45, (index) => index + 1)..shuffle();
  print(test..sublist(0,6));
  print(test.sublist(0,6));
  print(test);
  print(test..shuffle());
  // print(test.shuffle());


}