import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import 'package:netflix_cd/model/model_movie.dart';
import 'package:netflix_cd/widget/box_slider.dart';
import 'package:netflix_cd/widget/carousel_slider.dart';
import 'package:netflix_cd/widget/circle_slider.dart';

class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  FirebaseFirestore fireStore = FirebaseFirestore.instance;
  // Firestore fireStore = Firestore.instance;
  Stream<QuerySnapshot> streamData;


  @override
  Widget build(BuildContext context) {
    return _fetchData(context);

    List<ModelMovie> movies = [
      ModelMovie.fromMap({
        'title': '내머리속의 지우개',
        "keyword": "사랑/로맨스",
        'poster': 'movie1.png',
        'like': true
      }),
      ModelMovie.fromMap({
        'title': '내머리속의 지우개',
        "keyword": "사랑/로맨스",
        'poster': 'movie1.png',
        'like': true
      }),
      ModelMovie.fromMap({
        'title': '내머리속의 지우개',
        "keyword": "사랑/로맨스",
        'poster': 'movie1.png',
        'like': true
      }),
      ModelMovie.fromMap({
        'title': '내머리속의 지우개',
        "keyword": "사랑/로맨스",
        'poster': 'movie1.png',
        'like': true
      }),
    ];
    return ListView(
      children: [
        Stack(children: [
          CarouselImage(movies: movies,),
          TopBar()
        ],),
        CircleSlider(movies: movies,),
        BoxSlider(movies: movies)
      ],
    );
  }

  @override
  void initState() {
    super.initState();
    streamData = fireStore.collection('movie').snapshots();
  }
}

Widget _fetchData(BuildContext context) {
  return StreamBuilder<QuerySnapshot>(
    stream: FirebaseFirestore.instance.collection('movie').snapshots(),
    // stream: Firestore.instance.collection('movie').snapshots(),
    builder: (context, snapshot) {
      if(!snapshot.hasData) return LinearProgressIndicator();
      return _buildBody(context, snapshot.data.docs);
      // return _buildBody(context, snapshot.data.documents);
    },);
}
Widget _buildBody(BuildContext context, List<DocumentSnapshot> snapshot) {
  print(snapshot);

  List<ModelMovie> movies = snapshot.map((e) => ModelMovie.fromSnapshot(e)).toList();
  return ListView(
    children: [
      Stack(children: [
        CarouselImage(movies: movies,),
        TopBar()
      ],),
      CircleSlider(movies: movies,),
      BoxSlider(movies: movies)
    ],
  );
}


class TopBar extends StatelessWidget {


  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.fromLTRB(20, 7, 20, 7),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Image.asset(
            "assets/images/logo.png",
            fit: BoxFit.contain,
            height: 25,
          ),
          Container(
            padding: EdgeInsets.only(right: 1),
            child: Text(
              "TV 프로그램",
              style: TextStyle(fontSize: 14),
            ),
          ),
          Container(
            padding: EdgeInsets.only(right: 1),
            child: Text(
              "영화",
              style: TextStyle(fontSize: 14),
            ),
          ),
          Container(
            padding: EdgeInsets.only(right: 1),
            child: Text(
              "내가 찜한 콘텐츠",
              style: TextStyle(fontSize: 14),
            ),
          )
        ],
      ),
    );
  }
}
