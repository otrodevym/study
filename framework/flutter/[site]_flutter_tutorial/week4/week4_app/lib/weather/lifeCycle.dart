import 'package:flutter/material.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // home: ScreenA()  ,
      initialRoute: '/',
      routes: {
        "/" : (context) => ScreenA(),
        "/b" : (context) => ScreenB(),
        "/c" : (context) => ScreenC(),
      },
    );
  }
}


class ScreenA extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("ScreenA"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/b");
            },
              color: Colors.red,
              child: Text("go to ScreenB"),
            ),
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/c");
            },
              color: Colors.red,
              child: Text("go to ScreenC"),
            )
          ],
        ),
      ),
    );
  }
}




class ScreenB extends StatefulWidget {
  @override
  _ScreenBState createState() => _ScreenBState();
}

class _ScreenBState extends State<ScreenB> {

  @override
  Widget build(BuildContext context) {
    print('build is called');

    return Scaffold(
      appBar: AppBar(
        title: Text("ScreenB"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/");
            },
              color: Colors.red,
              child: Text("go to ScreenA"),
            ),
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/c");
            },
              color: Colors.red,
              child: Text("go to ScreenC"),
            )
          ],
        ),
      ),
    );
  }

  @override
  void initState() {
    print('initState');
    super.initState();
  }

  @override
  void dispose() {
    print('dispose');
    super.dispose();
  }
}



class ScreenC extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("ScreenC"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/");
            },
              color: Colors.red,
              child: Text("go to ScreenA"),
            ),
            RaisedButton(onPressed: () {
              Navigator.pushNamed(context, "/b");
            },
              color: Colors.red,
              child: Text("go to ScreenB"),
            )
          ],
        ),
      ),
    );
  }
}
