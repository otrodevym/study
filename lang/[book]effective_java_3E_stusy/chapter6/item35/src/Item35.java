public class Item35 {
    enum Ensemble {
        SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10), TRIPLE_QUARTET(12);

        private final int numberOfMusicians;

        Ensemble(int size) { this.numberOfMusicians = size; }

        public int numberOfMusicians() { return this.numberOfMusicians; }

//        public int numberOfNumsicians() { return ordinal() + 1;}// 절대 하지 말 것. 동작은 하지만 유지보수하기 끔찍하다.
    }
}
