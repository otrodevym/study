import 'dart:math';

void main() {
  Set<int> numSet = new Set();
  Random r = new Random();
  for (int i = 0; numSet.length < 7; i++ ) {
    numSet.add(r.nextInt(45) + 1);
  }
  numSet.forEach((element) {print(element);});

}
