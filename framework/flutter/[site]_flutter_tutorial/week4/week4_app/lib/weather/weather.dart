import 'package:flutter/material.dart';
import 'package:week4_app/weather/screens/loding.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "waether app",
      theme: ThemeData(primarySwatch: Colors.blue),
      home: Loding(),
    );
  }
}
