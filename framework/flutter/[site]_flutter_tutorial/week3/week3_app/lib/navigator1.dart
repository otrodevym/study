import 'package:flutter/material.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: MyPage1(),
      ),
    );
  }
}

class MyPage1 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("first page"),
      ),
      body: Center(
        child: RaisedButton(
          onPressed: () {
            Navigator.push( // MaterialPageRoute로 안전 장치로 Builder를 사용해 Route기능으로 추가
                context,
                MaterialPageRoute(
                  builder: (_) => MyPage2(),
                ));
          },
          child: Text("go to Second page"),
        ),
      ),
    );
  }
}

class MyPage2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("second page"),
      ),
      body: Center(
        child: RaisedButton(
          onPressed: () {
            Navigator.pop(context); // 사라져야 할 자신
          },
          child: Text("go to first page"),
        ),
      ),
    );
  }
}
