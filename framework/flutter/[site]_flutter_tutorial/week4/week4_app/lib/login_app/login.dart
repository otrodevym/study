import 'package:flutter/material.dart';
import 'file:///D:/__otrodevym/git/stard6/week4/week4_app/lib/login_app/my_button.dart';

class Login extends StatelessWidget {
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
      body: _buildButton(), // private은 같은 파일에서만 접근 가능
    );
  }

  Widget _buildButton() {
    return Padding(
      padding: EdgeInsets.all(16.0),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
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
          MyButton(
            image: Image.asset(
              'assets/images/google.png',
              width: 30.0,
            ),
            text: Text(
              "login with google",
              style: TextStyle(color: Colors.black87, fontSize: 15.0),
            ),
            radius: 4.0,
            color: Colors.white,
            onPressed: (){},
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
    );
  }
}
