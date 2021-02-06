import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

Future<Post> fetchPost() async {
  final firstDate = DateTime(2002, 12, 07);
  final nowDate = DateTime.now();
  final round = ((nowDate.difference(firstDate).inDays/7+1).toInt());
  final response = await http.get('https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=${round}');
  // print('response : ' + response.body);

  final response_under = await http.get('https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=${round-1}');
  // print('response_under : ' + response_under.body);
  var decodeData = json.decode(response.body);

  if (decodeData['returnValue'] == 'success') {
    if (response.statusCode == 200) {
      return Post.fromJson(decodeData);
    } else {
      throw Exception("failed to load post");
    }
  } else {
    if (response_under.statusCode == 200) {
      return Post.fromJson(decodeData);
    } else {
      throw Exception("failed to load post");
    }
  }

}

class Post {
  final int num1;
  final int num2;
  final int num3;
  final int num4;
  final int num5;
  final int num6;
  final int numBonus;


  Post({this.num1, this.num2, this.num3, this.num4, this.num5, this.num6,
      this.numBonus});

  factory Post.fromJson(Map<String, dynamic> json) {
    print(json.toString());
    print(json['drwtNo1'].runtimeType);
    print("json['drwtNo1'] : " + json['drwtNo1']);
    print(json['drwtNo2'].runtimeType);
    print("json['drwtNo2'] : " + json['drwtNo2']);
    print(json['drwtNo3'].runtimeType);
    print("json['drwtNo3'] : " + json['drwtNo3']);
    print(json['drwtNo4'].runtimeType);
    print("json['drwtNo4'] : " + json['drwtNo4']);
    print(json['drwtNo5'].runtimeType);
    print("json['drwtNo5'] : " + json['drwtNo5']);
    print(json['drwtNo6'].runtimeType);
    print("json['drwtNo6'] : " + json['drwtNo6']);
    print(json['bnusNo'].runtimeType);
    print("json['bnusNo'] : " + json['bnusNo']);

    return Post(
      num1 : int.parse(json["drwtNo1"]),
      num2 : int.parse(json["drwtNo2"]),
      num3 : int.parse(json["drwtNo3"]),
      num4 : int.parse(json["drwtNo4"]),
      num5 : int.parse(json["drwtNo5"]),
      num6 : int.parse(json["drwtNo6"]),
      numBonus : int.parse(json["bnusNo"]),
    );
  }

}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  Future<Post> latest_number;
  Future<Post> latest_number_under;
  String output = "output";

  @override
  void initState() {
    super.initState();
    latest_number = fetchPost();
    // print('latest_number : ' + latest_number.toString());
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text("금주 번호"),
            FutureBuilder(future: latest_number,
            builder: (context, snapshot){
              print('snapshot : ' + snapshot.toString());

              if (snapshot.hasData) {
                return Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    // Image.asset('asserts/image/${snapshot.data.num1}.png', width: 38, height: 38,),
                    // Image.asset('asserts/image/${snapshot.data.num2}.png', width: 38, height: 38,),
                    // Image.asset('asserts/image/${snapshot.data.num3}.png', width: 38, height: 38,),
                    // Image.asset('asserts/image/${snapshot.data.num4}.png', width: 38, height: 38,),
                    // Image.asset('asserts/image/${snapshot.data.num5}.png', width: 38, height: 38,),
                    // Image.asset('asserts/image/${snapshot.data.num6}.png', width: 38, height: 38,),
                    Text(snapshot.data.num1 ?? "Empty" ),
                    Text(snapshot.data.num2 ?? "Empty"),
                    Text(snapshot.data.num3 ?? "Empty"),
                    Text(snapshot.data.num4 ?? "Empty"),
                    Text(snapshot.data.num5 ?? "Empty"),
                    Text(snapshot.data.num6 ?? "Empty"),
                    Text(" + " ),
                    Text(snapshot.data.numBonus ?? "Empty"),
                    Image.asset('asserts/image/${snapshot.data.numBonus}.png', width: 38, height: 38,),
                  ],
                );
              } else if (snapshot.hasError){
                return Text('${snapshot.error}');
              }
              return CircularProgressIndicator();

            },)
          ],
        ),  
      ),
    );
  }
}
