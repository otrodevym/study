import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import 'login.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Firebase login app",
      home: Login(),
    );
  }
}
