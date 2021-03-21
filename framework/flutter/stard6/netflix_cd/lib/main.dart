import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'package:netflix_cd/screen/home_screen.dart';
import 'package:netflix_cd/screen/like_screen.dart';
import 'package:netflix_cd/screen/more_screen.dart';
import 'package:netflix_cd/screen/search_screen.dart';
import 'package:netflix_cd/widget/BottomBar.dart';

void main() async{
// void main() {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  TabController tabController;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "yongFlix",
      theme: ThemeData(
          brightness: Brightness.dark,
          primaryColor: Colors.black,
          accentColor: Colors.white),
      home: DefaultTabController(
        length: 4,
        child: Scaffold(
          body: TabBarView(
            physics: NeverScrollableScrollPhysics(),
            children: [
              HomeScreen(),
              SearchScreen(),
              LikeScree(),
              MoreScreen(),
            ],
          ),
          bottomNavigationBar: BottomBar(),
        ),
      ),
    );
  }
}
