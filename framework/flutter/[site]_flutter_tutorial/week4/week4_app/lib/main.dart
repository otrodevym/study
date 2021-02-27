import 'package:flutter/material.dart';

import 'dice.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Dice game',
      home: LogIn(),
    );
  }
}

class LogIn extends StatefulWidget {
  @override
  _LogInState createState() => _LogInState();
}

class _LogInState extends State<LogIn> {
  TextEditingController controller = TextEditingController();
  TextEditingController controller2 = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Log in"),
        backgroundColor: Colors.redAccent,
        centerTitle: true,
        leading: IconButton(
          icon: Icon(Icons.menu),
          onPressed: () {},
        ),
        actions: [IconButton(icon: Icon(Icons.search), onPressed: () {})],
      ),
      body: Builder(
        builder: (context) {
          return GestureDetector(
            // 빈화면을 눌렀을 때 발생할 이벤트
            onTap: () {
              // Focus tree :
              // Focus node : 포커스를 받는 특정 위젯을 식벽,
              // Focus Scope : 어떤 위젯들까지 포커스를 받을 수 있는지 나타냄
              FocusScope.of(context).unfocus();
            },
            child: SingleChildScrollView(
              child: Column(
                children: [
                  Padding(padding: EdgeInsets.only(top: 10)),
                  Center(
                    child: Image(
                        image: AssetImage('assets/images/2.gif'),
                        height: 170,
                        width: 190.0),
                  ),
                  Form(
                      child: Theme(
                    data: ThemeData(
                        primaryColor: Colors.teal,
                        inputDecorationTheme: InputDecorationTheme(
                            // 사용자에게 정보를 주는 레이블
                            labelStyle:
                                TextStyle(color: Colors.teal, fontSize: 15.0))),
                    child: Container(
                      padding: EdgeInsets.all(40.0),
                      child: Column(
                        children: [
                          TextField(
                            autofocus: true,
                            decoration:
                                InputDecoration(labelText: "Enter dice"),
                            keyboardType: TextInputType.emailAddress,
                            // 키보드 입력 타입
                            controller: controller,
                          ),
                          TextField(
                            decoration:
                                InputDecoration(labelText: "Enter password"),
                            keyboardType: TextInputType.text, // 키보드 입력 타입
                            obscureText: true, // 비밀번호 안보이게 처리
                            controller: controller2,
                          ),
                          SizedBox(
                            height: 40.0,
                          ),
                          ButtonTheme(
                            minWidth: 100.0,
                            height: 50.0,
                            child: RaisedButton(
                              onPressed: () {
                                if (controller.text == "dice" &&
                                    controller2.text == '1234') {
                                  Navigator.push(
                                      // 페이지 이동
                                      context,
                                      MaterialPageRoute(
                                        builder: (context) => Dice(),
                                      ));
                                } else {
                                  showSnackBar(context);
                                }
                              },
                              color: Colors.orange,
                              child: Icon(
                                Icons.arrow_forward,
                                color: Colors.white,
                                size: 35.0,
                              ),
                            ),
                          )
                        ],
                      ),
                    ),
                  ))
                ],
              ),
            ),
          );
        },
      ),
    );
  }
}

void showSnackBar(BuildContext context) {
  Scaffold.of(context).showSnackBar(SnackBar(
    content: Text(
      "로그인 정보를 확인해주세요",
      textAlign: TextAlign.center,
    ),
    duration: Duration(seconds: 2),
    backgroundColor: Colors.blue,
  ));
}
