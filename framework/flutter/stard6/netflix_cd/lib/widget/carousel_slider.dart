import 'package:carousel_slider/carousel_slider.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:netflix_cd/model/model_movie.dart';
import 'package:netflix_cd/screen/detail_screen.dart';

class CarouselImage extends StatefulWidget {
  final List<ModelMovie> movies;

  CarouselImage({this.movies});


  @override
  _CarouselImageState createState() => _CarouselImageState();
}

class _CarouselImageState extends State<CarouselImage> {
  List<ModelMovie> movies;
  List<Widget> images;
  List<String> keywords;
  List<bool> likes;
  int _currentPage = 0;
  String _currentKeyword;

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(
        children: [
          Container(
            padding: EdgeInsets.all(20),
          ),
          CarouselSlider(
            items: images,
            options: CarouselOptions(
              onPageChanged: (index, reason) {
                setState(() {
                  _currentPage = index;
                  _currentKeyword = keywords[_currentPage];
                });
              },
            ),
          ),
          Container(
            padding: EdgeInsets.fromLTRB(0, 10, 0, 3),
            child: Text(
              _currentKeyword,
              style: TextStyle(fontSize: 11),
            ),
          ),
          Container(
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                Container(
                  child: Column(
                    children: [
                      likes[_currentPage]
                          ? IconButton(
                              icon: Icon(Icons.check), onPressed: () {
                                setState(() {
                                  likes[_currentPage] = !likes[_currentPage];
                                  movies[_currentPage].reference.update({'like' : likes[_currentPage]});
                                });
                      })
                          : IconButton(icon: Icon(Icons.add), onPressed: () {
                        setState(() {
                          likes[_currentPage] = !likes[_currentPage];
                          movies[_currentPage].reference.update({'like' : likes[_currentPage]});
                        });
                      }),
                      Text(
                        "내가 찜한 콘텐츠 버튼",
                        style: TextStyle(fontSize: 11),
                      )
                    ],
                  ),
                ),
                Container(
                  padding: EdgeInsets.only(right: 10),
                  child: FlatButton(
                    color: Colors.white60,
                    onPressed: () {},
                    child: Row(
                      children: [
                        Icon(
                          Icons.play_arrow,
                          color: Colors.black,
                        ),
                        Padding(
                          padding: EdgeInsets.all(3),
                        ),
                        Text(
                          "재생",
                          style: TextStyle(color: Colors.black),
                        )
                      ],
                    ),
                  ),
                ),
                Container(
                  padding: EdgeInsets.only(right: 10),
                  child: Column(
                    children: [
                      IconButton(
                          icon: Icon(Icons.info),
                          onPressed: () {
                            Navigator.of(context).push(MaterialPageRoute(
                              fullscreenDialog: true,
                              builder: (context) {
                                return DetailScreen(movie: movies[_currentPage],);
                              },
                            ));
                          }),
                      Text(
                        "정보",
                        style: TextStyle(fontSize: 11),
                      )
                    ],
                  ),
                )
              ],
            ),
          ),
          Container(
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: makeIndicator(likes, _currentPage),
            ),
          )
        ],
      ),
    );
  }

  @override
  void initState() {
    super.initState();
    movies = widget.movies;
    images =
        // movies.map((m) => Image.asset("./assets/images/" + m.poster)).toList();
        movies.map((m) => Image.network(m.poster)).toList();
    keywords = movies.map((e) => e.keyword).toList();
    likes = movies.map((e) => e.like).toList();
    _currentKeyword = keywords[0];
  }
}

List<Widget> makeIndicator(List list, int _currentPage) {
  List<Widget> results = [];
  print(list.length);
  for (int i = 0; i < list.length; i++) {
    results.add(Container(
      width: 8,
      height: 8,
      margin: EdgeInsets.symmetric(vertical: 10.0, horizontal: 2.0),
      decoration: BoxDecoration(
          shape: BoxShape.circle,
          color: _currentPage == i
              ? Color.fromRGBO(255, 255, 255, 0.9)
              : Color.fromRGBO(255, 255, 255, 0.4)),
    ));
  }
  return results;
}
