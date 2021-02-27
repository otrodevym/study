import 'package:flutter/material.dart';
import 'dart:math';
import 'package:fluttertoast/fluttertoast.dart';

class Dice extends StatefulWidget {
  @override
  _DiceState createState() => _DiceState();
}

class _DiceState extends State<Dice> {
  int leftDice = 2;
  int rightDice = 5;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.redAccent,
      appBar: AppBar(
        backgroundColor: Colors.redAccent,
        title: Text("Die game"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Padding(
              padding: EdgeInsets.all(32),
              child: Row(
                // mainAxisAlignment: MainAxisAlignment.center, // mainAxisAlignment: 주축 정렬
                children: [
                  // Image(
                  //   image: AssetImage("assets/images/dice1.png"),
                  //   width: 300.0,
                  // )
                  Expanded(
                      // 이미지를 공간안에서 확장해줌
                      // flex: 2,
                      child: Image.asset("assets/images/dice$leftDice.png")),
                  // 간편하게 이미지 호출 가능
                  SizedBox(
                    width: 20.0,
                  ),
                  Expanded(
                      // flex: 1, // 크기를 대비하는 기능
                      child: Image.asset('assets/images/dice$rightDice.png')),
                  // 간편하게 이미지 호출 가능
                ],
              ),
            ),
            SizedBox(
              height: 60.0,
            ),
            ButtonTheme(
                minWidth: 100.0,
                height: 60,
                child: RaisedButton(
                  child: Icon(
                    Icons.play_arrow,
                    color: Colors.white,
                    size: 50.0,
                  ),
                  onPressed: () {
                    setState(() {
                      leftDice = Random().nextInt(6) + 1; // 0부터 5까지이므로 +1을 해줌
                      // print(leftDice);
                      rightDice = Random().nextInt(6) + 1;
                      // print(rightDice);
                    });
                    showToastMessage("left dice : $leftDice, right dice : $rightDice");

                  },
                  color: Colors.orangeAccent,
                ))
          ],
        ),
      ),
    );
  }
}

showToastMessage(String message) {
  Fluttertoast.showToast(msg: message, backgroundColor: Colors.white, toastLength: Toast. LENGTH_SHORT, gravity: ToastGravity.BOTTOM);
}
