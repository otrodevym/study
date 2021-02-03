import 'package:english_words/english_words.dart';
import 'package:flutter/material.dart';
import 'package:flutter_app/favorite_list_page.dart';

Set<WordPair> _saved = Set<WordPair>();

class WordListWidget extends StatelessWidget {
  const WordListWidget({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        actions: [
          IconButton(icon: Icon(Icons.favorite), onPressed: (){
            print("action button");
            Navigator.of(context).push(MaterialPageRoute(builder: (context){
              return FavoriteListPage(_saved.toList());
            }));
          })
        ],
        title: Text("app Bar"),
      ),
      body: RandomWords(),
    );
  }
}

class RandomWords extends StatefulWidget {
  @override
  _RandomWordsState createState() => _RandomWordsState();
}

class _RandomWordsState extends State<RandomWords> {
  List<WordPair> words = [];


  @override
  Widget build(BuildContext context) {
    // final wordPair = WordPair.random();
    // return Text(wordPair.asCamelCase);
    if (_saved.contains(words)) {

    }

    return ListView.builder(itemBuilder: (BuildContext context, int index) {
      if (index >= words.length) words.addAll(generateWordPairs().take(10));
      return _getRow(words[index]);
    });

    // return ListView.builder(
    //     itemCount: 50,
    //     itemBuilder: (BuildContext context, int index) {
    //       return Padding(
    //         padding: const EdgeInsets.all(8.0),
    //         child: Text(WordPair.random().asCamelCase, textScaleFactor: 1.5,
    //         style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
    //         ),
    //       );
    //     });
  }

  // List<Widget> items = [];

  Widget _getRow(WordPair wordPair) {
    bool contains = _saved.contains(wordPair);
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        ListTile(
          onTap:() {
            setState(() {
              if(contains){
                _saved.remove(wordPair);
              } else {
                _saved.add(wordPair);
              }
            });
            print(_saved.toString());
          },
          leading: Icon(Icons.favorite, color: Colors.redAccent),
          title: Text(wordPair.asCamelCase,
              style: TextStyle(fontSize: 15, fontWeight: FontWeight.bold)),
          trailing: Icon(contains? Icons.favorite : Icons.favorite_border, color: Colors.redAccent),
          subtitle: Text(wordPair.asCamelCase),
        ),
        Divider(
          thickness: 1,
          color: Colors.grey[300],
          height: 10,
        )
      ],
    );
  }
}