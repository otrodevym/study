import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Charactor Card',
      home: MyCard(),
    );
  }
}

class MyCard extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("BBANTO"),
        centerTitle: true,
        backgroundColor: Colors.redAccent,
        elevation: 0.0,
      ),
      body:
      // Padding(
      //     padding: EdgeInsets.fromLTRB(
      //       // insets : 무언가를 삽입하다, 끼워넣다.
      //       // LTRB : left, top, right, bottom
      //         30.0, 40.0, 0.0, 0.0
      //     ),
      //   child:
        Center( // 가로축 정렬
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center , // 세로축 정렬
            children: [
              Text("Test"),
              Text("Test"),
              Text("Test"),
              Text("Test"),
            ],
          // ),
      ),
        ),
    );
  }
}
