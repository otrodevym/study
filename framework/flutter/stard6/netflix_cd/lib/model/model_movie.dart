import 'package:cloud_firestore/cloud_firestore.dart';

class ModelMovie {
  final String title;
  final String keyword;
  final String poster;
  final bool like;
  final DocumentReference reference;


  ModelMovie.fromMap(Map<String, dynamic> map, {this.reference})
      : title = map['title'],
        keyword = map['keyword'],
        poster = map['poster'],
        like = map['like'];

  ModelMovie.fromSnapshot(DocumentSnapshot snapshot)
      : this.fromMap(snapshot.data(), reference: snapshot.reference);
      // : this.fromMap(snapshot.data, reference: snapshot.reference);

  @override
  String toString() => "Movie<$title: $keyword>";
}