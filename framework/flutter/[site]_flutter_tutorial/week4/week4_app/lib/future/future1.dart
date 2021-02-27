main() async{
  // print('before1');

  // Future(() {
  //   print("running");
  // }).then((_) => print('than'));
  // print("test");
  //
  print('fetcing..');
  print(await createOrderMessage());
  print('end');

}

Future<String> createOrderMessage() async{
  print('synchronous');
  var order = await fetchUserOrder();
  return 'Your order is : $order';

}

Future<String> fetchUserOrder() {
  return Future.delayed(Duration(seconds: 2), () => 'Large Latte');
}

