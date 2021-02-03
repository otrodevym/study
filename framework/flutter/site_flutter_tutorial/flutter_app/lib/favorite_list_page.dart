import 'package:english_words/english_words.dart';
import 'package:flutter/material.dart';

class FavoriteListPage extends StatelessWidget {
  final List<WordPair> favorites;

  const FavoriteListPage(this.favorites,  {Key key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    print("this is favorite" + favorites.toString());

    return Scaffold(
      appBar: AppBar(
        title: Text("favorite list"),
      ),
      body: ListView.separated(itemBuilder: (BuildContext context, index) {
        return ListTile(
            title: Text(favorites[index].asCamelCase,
                style: TextStyle(fontSize: 15, fontWeight: FontWeight.bold)),
          );
      }, itemCount: favorites.length, separatorBuilder: (BuildContext context, int index) {
        return Divider(
          thickness: 1,
          color: Colors.grey[300],
          height: 5,
          indent: 16,
          endIndent: 16,
        );
      }, ),
    );
  }
}
