import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "login App",
      theme: ThemeData(primarySwatch: Colors.grey),
      home: LogIn(),
    );
  }
}

class LogIn extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blue,
        title: Text(
          "Sign In",
          style: TextStyle(color: Colors.white),
        ),
        centerTitle: true,
        elevation: 0.2,
      ),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ButtonTheme(
              height: 50.0,
              child: RaisedButton(
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    Image.asset(
                      'assets/images/google.png',
                      width: 30,
                    ),
                    Text(
                      "login with google",
                      style: TextStyle(color: Colors.black87, fontSize: 15),
                    ),
                    Opacity(
                      opacity: 0.0,
                      child: Image.asset(
                        "assets/images/google.png",
                        width: 30,
                      ),
                    )
                    // 간격을 맞추기 위해 임시로 만듬 투명도를 조정하는 위젯
                  ],
                ),
                color: Colors.white,
                onPressed: () {},
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.all(Radius.circular(4.0))),
              ),
            ),
            SizedBox(
              height: 10.0,
            ),
            ButtonTheme(
              height: 50.0,
              child: RaisedButton(
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    Image.asset(
                      'assets/images/facebook.png',
                      width: 30,
                    ),
                    Text(
                      "login with facebook",
                      style: TextStyle(color: Colors.black87, fontSize: 15),
                    ),
                    Opacity(
                      opacity: 0.0,
                      child: Image.asset(
                        "assets/images/facebook.png",
                        width: 30,
                      ),
                    )
                    // 간격을 맞추기 위해 임시로 만듬 투명도를 조정하는 위젯
                  ],
                ),
                color: Colors.white,
                onPressed: () {},
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.all(Radius.circular(4.0))),
              ),
            ),
            SizedBox(
              height: 10.0,
            ),
            ButtonTheme(
              height: 50.0,
              child: RaisedButton(
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    Image.asset(
                      'assets/images/email.png',
                      width: 30,
                    ),
                    Text(
                      "login with email",
                      style: TextStyle(color: Colors.black87, fontSize: 15),
                    ),
                    Opacity(
                      opacity: 0.0,
                      child: Image.asset(
                        "assets/images/email.png",
                        width: 30,
                      ),
                    )
                    // 간격을 맞추기 위해 임시로 만듬 투명도를 조정하는 위젯
                  ],
                ),
                color: Colors.white,
                onPressed: () {},
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.all(Radius.circular(4.0))),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
