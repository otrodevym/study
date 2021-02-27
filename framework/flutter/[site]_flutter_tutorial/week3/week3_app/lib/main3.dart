import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("Toast Message"),
          centerTitle: true,
        ),
        body: Center(
          child: FlatButton(
            onPressed: () {FlutterToast();},
            child: Text("Toast"),
            color: Colors.green,
          ),
        ),
      ),
    );
  }
}

void FlutterToast() {
  // print('FlutterToast');
  Fluttertoast.showToast(
      msg: "Flutter",
      gravity: ToastGravity.BOTTOM,
      backgroundColor: Colors.redAccent,
      fontSize: 20.0,
      textColor: Colors.white,
      toastLength: Toast.LENGTH_SHORT
  );
}
