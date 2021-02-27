import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Snap Bar"),
          centerTitle: true,
        ),
        body: Builder(
          builder: (ctx) {
            return Center(
              child: FlatButton(
                child: Text(
                  "show me",
                  style: TextStyle(color: Colors.white),
                ),
                color: Colors.red,
                onPressed: () => {
                  Scaffold.of(ctx).showSnackBar(SnackBar(
                    content: Text("Hellow"),
                  ))
                },
              ), // Raised button, Floating action button 디자인과 모양이 다르고 기능은 동일함
            );
          },
        ));
  }
}
