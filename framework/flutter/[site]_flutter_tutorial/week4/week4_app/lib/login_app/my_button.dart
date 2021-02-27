import 'package:flutter/material.dart';
import 'package:week4_app/login_app/login.dart';

class MyButton extends StatelessWidget {
  final Widget image;
  final Widget text;
  final Color color;
  final double radius;
  final VoidCallback onPressed;

  MyButton({this.image, this.text, this.color, this.radius, this.onPressed});

  @override
  Widget build(BuildContext context) {
    // final Login login = new Login(); // private 테스트
    // login.bu
    return ButtonTheme(
      height: 50.0,
      child: RaisedButton(
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            image,
            text,
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
        color: color,
        onPressed: onPressed,
        shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.all(Radius.circular(radius))),
      ),
    );
  }
}
