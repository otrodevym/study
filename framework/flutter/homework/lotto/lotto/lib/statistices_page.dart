import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'package:html/dom.dart' as dom;
import 'package:html/parser.dart' as parser;

// Future<List<int>> fetchGet() async {
//   await Future.delayed(Duration(seconds: 1));
//   http.Response response = await http.get("https://www.dhlottery.co.kr/getResult.domethod=statBynumber");
//   dom.Document document = parser.parse(response.body);
//   final mainClass = document.getElementsByClassName('tbl_data');
//   List myList = List<int>();
//   for (int i = 2; i < 135; i += 3) {
//     myList.add(int.parse(mainClass[1].getElementsByTagName('td')[i].innerHtml));
//   }
//   return myList;
// }
//
// class statisticsPage extends StatefulWidget {
//   @override
//   _statisticsPageState createState() => _statisticsPageState();
// }
//
// class _statisticsPageState extends State<statisticsPage> {
//   Furture<List<int>> powertest;
//
//
//   @override
//   void initState() {
//     super.initState();
//     powertest = fetchGet();
//   }
//
//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       body: _buildBody(),
//     );
//   }
//
//   widget _buildBody() {
//     return Center(
//       child: Column(
//         mainAxisAlignment: MainAxisAligment.center,
//         children: [
//           Text(
//             '번호별 통계번호',
//             style: TextStyle(fontsize:20),
//           ),
//           FutureBuilder<List<int>>(
//             furture: powertest,
//             builder: (context, snapshot) {
//               if(snapshot.hasData == false){
//                 return CircularProgressIndicator();
//               } else if (snapshot.hasData) {
//                 return new Column(
//                   mainAxisAlignment: MainAxisAlignment.center,
//                   mainAxisSize: MainAxisSize.max,
//                   children: [
//                     SizeBox(
//                       height:400.0,
//                       width:350.0,
//                       child: new ListView.builder(
//                         itemCount: snapshot.data.length,
//                         itemBuilder: (context, index) {
//                           return new ListTile(
//                             leading: CircleAvatar(
//                               backgroundImage: AssertImage('asserts/image/${index+1}'.png)
//                             )
//                           )
//                         }
//                       )
//
//                     )
//                   ]
//                 )
//               }
//
//             }
//           )
//         ]
//       )
//     )
//   }
// }
