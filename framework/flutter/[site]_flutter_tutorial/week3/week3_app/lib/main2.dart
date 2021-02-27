import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("SnackBar"),
          centerTitle: true,
        ),
        body: MySnackBar(),
      )
    );
  }
}

class MySnackBar extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // final size = MediaQuery.of(context).size;
    return Center(
      child: RaisedButton(
          child: Text('show me'),
          onPressed: () {
            Scaffold.of(context).showSnackBar(SnackBar(
              content: Text(
                "Hellow",
                textAlign: TextAlign.center,
                style: TextStyle(
                  color: Colors.white
                ),
              ),
              backgroundColor: Colors.teal,
              duration: Duration(milliseconds: 1000),
            ));
          }),
    );
  }
}
