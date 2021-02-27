import 'package:flutter/material.dart';
import 'package:geolocator/geolocator.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';


class Loding extends StatefulWidget {
  @override
  _LodingState createState() => _LodingState();
}

class _LodingState extends State<Loding> {

  void fetchData() async{
    // Future<http.Response> fetchAlbum() {
    //   return http.get(Uri.https('jsonplaceholder.typicode.com', 'albums/1'));
    // }
    http.Response res = await http.get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1");
    if(res.statusCode == 200) {
      String jsonData = res.body;
      var myJson = jsonDecode(jsonData);
      print(myJson['weather'][0]['description']);
    }
  }

  void getLocation() async{
    try {
      Position position = await Geolocator.getCurrentPosition(
          desiredAccuracy: LocationAccuracy.high);
      print('position $position');
    } catch(e) {
      print("$e the connection failed");
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: RaisedButton(
          onPressed: null,
          child: Text("Get My Location", style: TextStyle(
            color: Colors.white
          ),),
          color: Colors.blue,
        ),
      ),
    );
  }

  @override
  void initState() {
    super.initState();
    getLocation();
    fetchData();
  }
}
