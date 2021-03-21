import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import 'package:netflix_cd/model/model_movie.dart';
import 'package:netflix_cd/screen/detail_screen.dart';

class LikeScree extends StatefulWidget {
  @override
  _LikeScreeState createState() => _LikeScreeState();
}

class _LikeScreeState extends State<LikeScree> {
  Widget _buildBody(BuildContext context) {
    return StreamBuilder(
      stream: FirebaseFirestore.instance
          .collection("movie")
          .where("like", isEqualTo: true)
          .snapshots(),
      builder: (context, snapshot) {
        if (!snapshot.hasData) return LinearProgressIndicator();
        return _buildList(context, snapshot.data.docs);
      },
    );
  }

  Widget _buildList(BuildContext context, List<DocumentSnapshot> snapshot) {
    return Expanded(
        child: GridView.count(
      crossAxisCount: 3,
      childAspectRatio: 1 / 1.5,
      padding: EdgeInsets.all(3),
      children: snapshot.map((e) => _buildListItem(context, e)).toList()));
  }

  Widget _buildListItem(BuildContext context, DocumentSnapshot data) {
    final movie = ModelMovie.fromSnapshot(data);
    return InkWell(
      child: Image.network(movie.poster),
      onTap: () {
        Navigator.of(context).push(MaterialPageRoute(
          fullscreenDialog: true,
          builder: (context) {
            return DetailScreen(
              movie: movie,
            );
          },
        ));
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(
        children: [
          Container(
            padding: EdgeInsets.fromLTRB(20, 27, 20, 7),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.start,
              children: [
                Image.asset(
                  "assets/images/logo.png",
                  fit: BoxFit.contain,
                  height: 25,
                ),
                Container(
                  padding: EdgeInsets.only(left: 30),
                  child: Text("내가 찜한 콘텐츠", style: TextStyle(fontSize: 14),),
                )
              ],
            ),
          ),
          _buildBody(context)
        ],
      ),
    );
  }
}
