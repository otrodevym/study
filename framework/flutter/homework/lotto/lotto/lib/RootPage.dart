import 'package:flutter/material.dart';

import 'HomePage.dart';

class RootPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
        length: 4,
        child: Scaffold(
          appBar: AppBar(
            title: Text("Lotoo Generator",style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold),),
          bottom: TabBar(tabs: [
              Tab(icon: Icon(Icons.home), text: '홈'),
              Tab(icon: Icon(Icons.loop), text: '번호생성'),
              Tab(icon: Icon(Icons.filter_6), text: '통계'),
              Tab(icon: Icon(Icons.settings), text: '설정')
            ],
          ),
        ),
          body: TabBarView(
            children: [
              // Text("홈화면"),
              HomePage(),
              Text("번호생성화면"),
              Text("통계화면"),
              Text("설정화면"),
            ],
          ),
        ),
    );
  }
}
