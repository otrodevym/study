import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

void main() => runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      home: HomeActivity(),
    ));

class HomeActivity extends StatefulWidget {
  @override
  _HomeActivityState createState() => _HomeActivityState();
}

class _HomeActivityState extends State<HomeActivity> {
  String outPut = "0";
  String _out = "0";
  double num1 = 0.0;
  double num2 = 0.0;

  String operand = "";

  pressedButton(String val) {
    print(val);
    if (val == "C") {
      _out = "0";
      num1 = 0;
      num2 = 0;
      operand = "";
    } else if (val == "+" || val == "-" || val == "*" || val == "/") {
      num1 = double.parse(outPut);
      operand = val;
      _out = "0";
      outPut = outPut + val;
    } else if (val == ".") {
      if (_out.contains(".")) {
        return;
      } else {
        _out = _out + val;
      }
    } else if (val == "=") {
      num2 = double.parse(outPut);
      if (operand == "+") {
        _out = (num1 + num2).toString();
      }
      if (operand == "-") {
        _out = (num1 - num2).toString();
      }
      if (operand == "*") {
        _out = (num1 * num2).toString();
      }
      if (operand == "/") {
        _out = (num1 / num2).toString();
      }
      num1 = 0.0;
      num2 = 0.0;
    } else {
      _out = _out + val;
    }
    setState(() {
      outPut = double.parse(_out).toStringAsFixed(2);
    });
  }

  Widget CalcBtn(String BtnVal) {
    return Expanded(
        child: Container(
      padding: EdgeInsets.all(10.0),
      decoration: BoxDecoration(color: Colors.grey[300], boxShadow: [
        BoxShadow(
          color: Colors.grey[500],
          offset: Offset(2.0, 2.0),
          blurRadius: 8.0,
          spreadRadius: 1.0,
        ),
        BoxShadow(
          color: Colors.white,
          offset: Offset(-2.0, -2.0),
          blurRadius: 8.0,
          spreadRadius: 1.0,
        )
      ]),
      child: MaterialButton(
        padding: EdgeInsets.all(15.0),
        child: Text(
          BtnVal,
          style: TextStyle(fontSize: 30.0),
        ),
        onPressed: () => pressedButton(BtnVal),
      ),
    ));
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
        child: Scaffold(
      backgroundColor: Colors.grey[300],
      body: Container(
        child: Column(
          children: [
            Container(
              alignment: Alignment.bottomRight,
              padding: EdgeInsets.symmetric(horizontal: 12.0, vertical: 50.0),
              child: Text(
                outPut,
                style: TextStyle(fontSize: 40.0),
              ),
            ),
            Expanded(child: Divider()),
            Column(
              children: [
                Row(
                  children: [
                    CalcBtn("."),
                    CalcBtn("C"),
                    CalcBtn("<-"),
                    CalcBtn("*")
                  ],
                ),
                Row(
                  children: [
                    CalcBtn("7"),
                    CalcBtn("8"),
                    CalcBtn("9"),
                    CalcBtn("/")
                  ],
                ),
                Row(
                  children: [
                    CalcBtn("4"),
                    CalcBtn("5"),
                    CalcBtn("6"),
                    CalcBtn("+")
                  ],
                ),
                Row(
                  children: [
                    CalcBtn("1"),
                    CalcBtn("2"),
                    CalcBtn("3"),
                    CalcBtn("-")
                  ],
                ),
                Row(
                  children: [CalcBtn("0"), CalcBtn("=")],
                )
              ],
            ),
          ],
        ),
      ),
    ));
  }
}
