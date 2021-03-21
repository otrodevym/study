import 'package:flutter/material.dart';
import 'package:netflix_cd/model/model_movie.dart';
import 'package:netflix_cd/screen/detail_screen.dart';

class CircleSlider extends StatelessWidget {
  final List<ModelMovie> movies;

  CircleSlider({this.movies});

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(7),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text("미리보기"),
          Container(
            height: 120,
            child: ListView(
              scrollDirection: Axis.horizontal,
              children: makeCircleImages(context, movies),
            ),
          )
        ],
      ),
    );
  }
}

List<Widget> makeCircleImages(BuildContext context, List<ModelMovie> movies) {
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
          child: CircleAvatar(
            // backgroundImage: AssetImage('assets/images/' + movies[i].poster),
            backgroundImage: NetworkImage(movies[i].poster),
            radius: 48,
          ),
        ),
      ),
    ));
  }
  return results;
}
