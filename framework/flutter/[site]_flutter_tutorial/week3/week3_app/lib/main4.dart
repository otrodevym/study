import 'package:flutter/material.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            backgroundColor: Colors.blue,
            body: SafeArea(
              child: Container(
                color: Colors.red,
                child: Text(
                  "Text",
                  style: TextStyle(color: Colors.blue),
                ),
                width: 100,
                height: 100,
                // margin: EdgeInsets.all(20),
                margin: EdgeInsets.symmetric(
                  vertical: 80,
                  horizontal: 20
                ),
                // padding: EdgeInsets.all(20),
                padding: EdgeInsets.all(40),

              ),
            )));
  }
}
