import 'package:flutter/material.dart';
import 'package:netflix_cd/model/model_movie.dart';
import 'package:netflix_cd/screen/detail_screen.dart';

class BoxSlider extends StatelessWidget {
  final List<ModelMovie> movies;

  BoxSlider({this.movies});

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(7),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text("지금 뜨는 콘텐츠"),
          Container(
            height: 120,
            child: ListView(
              scrollDirection: Axis.horizontal,
              children: makeBoxImages(context, movies),
            ),
          )
        ],
      ),
    );
  }
}

List<Widget> makeBoxImages(BuildContext context, List<ModelMovie> movies) {
  List<Widget> results = [];
  for (int i = 0; i < movies.length; i++) {
    results.add(InkWell(
      onTap: () {
        Navigator
            .of(context)
            .push(MaterialPageRoute(
            fullscreenDialog: true,
            builder: (context)
        {
          return DetailScreen(movie: movies[i],);
        }));
      },
      child: Container(
        padding: EdgeInsets.only(right: 10),
        child: Align(
          alignment: Alignment.centerLeft,
          // child: Image.asset("assets/images/" + movies[i].poster),
          child: Image.network(movies[i].poster),
        ),
      ),
    ));
  }
  return results;
}
