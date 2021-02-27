import 'package:flutter/material.dart';
import 'package:week4_app/login_app/firebaseTest.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Futrue',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: MyHome(),
    );
  }
}

class MyHome extends StatefulWidget {
  @override
  _MyHomeState createState() => _MyHomeState();
}

class _MyHomeState extends State<MyHome> {
  String result = 'no data';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Future test"),
      ),
      body: Center(
        child: Padding(
          padding: EdgeInsets.all(30.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              RaisedButton(
                onPressed: () {
                  futureTest();
                },
                child: Padding(
                  padding: EdgeInsets.all(8.0),
                  child: Text(
                    'Future Text',
                    style: TextStyle(fontSize: 20.0),
                  ),
                ),
              ),
              SizedBox(
                height: 20.0,
              ),
              Text(
                result,
                style: TextStyle(fontSize: 20.0, color: Colors.redAccent),
              ),
              Divider(
                height: 20.0,
                thickness: 2.0,
              ),
              FutureBuilder(builder: (context, snapshot) {
                if(snapshot.connectionState == ConnectionState.done) {
                  print(snapshot);
                  return Text(snapshot.data, style: TextStyle(fontSize: 20.0, color : Colors.blue),);
                }
                return CircularProgressIndicator();

              }, future: myFuture(),)
            ],
          ),
        ),
      ),
    );
  }

  Future<void> futureTest() async {
    print("start");
    await Future.delayed(Duration(seconds: 3)).then((_) {
      print("future");
      setState(() {
        this.result = 'The data is fetched';
        print("result");
        print("setState end");
      });
    });
    print("futureTest");
  }

  Future<String> myFuture() async {
    await Future.delayed(Duration(seconds: 2));
    return 'another Future';
  }

}
