class Test {
  t() {
    print("test");
  }
}

class Test2 extends Test {
  // @override
  // t() {
  //   print("test2");
  // }
}

main() {
  Test t = new Test();
  Test2 tt = new Test2();

  t.t();
  tt.t();


  // String name = "Test";
  //
  // print("$name hi" );
  //
  //
  // List<dynamic> num = new List();
  // // List<int> num = new List();
  // num.add(1);
  // num.add("asdsad");
  // num.add(3);
  // print(num);

}