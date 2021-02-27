import 'dart:io';

main() {
  showData();
}

void showData() async{
  startTask();
  String s = await accessData();
  fatchData(s);
}

void fatchData(String account) {
  print("fatchData $account");
}

Future<String> accessData() async{
  String account;
  Duration time = Duration(seconds: 3);
  if (time.inSeconds > 2) {
    // sleep(time);

    await Future.delayed(time, () {
      account = '8500원';
      print("accessData dd : $account ");
    }); // 비동기 처리

  } else {
    print("accessData");
  }
  return account;
}

void startTask() {
  print("startTask");
}
