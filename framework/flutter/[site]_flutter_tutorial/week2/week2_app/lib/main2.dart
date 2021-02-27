import 'package:flutter/material.dart';
import 'package:week2_app/main.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'AppBar',
      theme: ThemeData(primarySwatch: Colors.red),
      home: MyPage(),
    );
  }
}

class MyPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("AppBar"),
        centerTitle: true,
        elevation: 0.0,
        // leading:
        // IconButton(icon: Icon(Icons.menu), onPressed: () => {print("hi")}),
        actions: [
          IconButton(
              icon: Icon(Icons.shopping_cart),
              onPressed: () => {print("hi22")}),
          IconButton(
              icon: Icon(Icons.search), onPressed: () => {print("hi33")}),
        ],
      ),
      drawer: Drawer(
        child: ListView(
          padding: EdgeInsets.zero, // 여백은 필요 없다.
          children: [
            UserAccountsDrawerHeader(
              accountName: Text("yong"),
              accountEmail: Text("otrodevym@gmail.com"),
              currentAccountPicture: CircleAvatar(
                backgroundColor: Colors.white,
                backgroundImage: AssetImage('assets/images/1.jpg'),
              ),
              otherAccountsPictures: [
                // currentAccountPicture와 같은 형태지만 복수로 지정 가능
                CircleAvatar(
                  backgroundColor: Colors.white,
                  backgroundImage: AssetImage('assets/images/2.gif'),
                ),
                // CircleAvatar( // 복수가 되는지 테스트
                //   backgroundColor: Colors.white,
                //   backgroundImage: AssetImage('assets/images/2.gif'),
                // )
              ],
              onDetailsPressed: () => {
                // 더보기 화살표를 구현
                print("clicked")
              },
              decoration: BoxDecoration(
                  color: Colors.red[200],
                  borderRadius: BorderRadius.only(
                      bottomLeft: Radius.circular(40.0),
                      bottomRight: Radius.circular(40.0))), // 빨간 부분을 꾸미기 위한 기능
            ),
            ListTile(
              leading: Icon(Icons.home, color: Colors.grey[850],), // 화면의 첫 부분
              title: Text("Home"),
              onTap: () => {
                print("home!!")
              },
              trailing: Icon(Icons.add), // 화면의 끝 부분
            ),
            ListTile(
              leading: Icon(Icons.settings, color: Colors.grey[850],), // 화면의 첫 부분
              title: Text("Setting"),
              onTap: () => {
                print("Setting!!")
              },
              trailing: Icon(Icons.add), // 화면의 끝 부분
            ),
            ListTile(
              leading: Icon(Icons.question_answer, color: Colors.grey[850],), // 화면의 첫 부분
              title: Text("Q&A"),
              onTap: () => {
                print("Q&A!!")
              },
              trailing: Icon(Icons.add), // 화면의 끝 부분
            ),
          ],
        ),
      ),
    );
  }
}
