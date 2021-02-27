import 'package:flutter/material.dart';

main() => runApp(MyApp());


class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: MyPage(),
      ),
    );
  }
}


class MyPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.teal,
      body: SafeArea(
        // child: Center(
          child: Column(
            // mainAxisAlignment: MainAxisAlignment.center,
            // mainAxisSize: MainAxisSize.min,

            // verticalDirection: VerticalDirection.up,
            // verticalDirection: VerticalDirection.down,

            // mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            // mainAxisAlignment: MainAxisAlignment.spaceBetween,

            // crossAxisAlignment: CrossAxisAlignment.end,
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              Container(
                // width: 100,
                height: 100,
                color: Colors.white,
                child: Text("Container1"),
              ),
              SizedBox(height: 30.0,),
              Container(
                // width: 100,
                height: 100,
                color: Colors.red,
                child: Text("Container2"),
              ),

              Container(
                // width: 100,
                height: 100,
                color: Colors.blue,
                child: Text("Container3"),
              ),
              // Container(
                // width: double.infinity,
              // ),
            ],
          ),
        ),
      // )
    );
  }
}
