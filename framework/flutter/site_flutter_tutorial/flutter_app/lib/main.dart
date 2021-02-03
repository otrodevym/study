import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';
import 'package:flutter_app/word_list_page.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    print("test");
    // nouns.take(30).forEach((element) { print(element); });
    // WordPair wordPair = WordPair.random();

    return MaterialApp(
        // body: Container(child: Center(child: Text("The yong "))),
        // body: Padding(
        // padding: const EdgeInsets.all(8.0),
        // child: Center(child: Text(wordPair.asCamelCase)),
      home: WordListWidget(),
    );
  }
}


