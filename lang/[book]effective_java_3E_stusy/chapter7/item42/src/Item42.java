import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

import static java.util.Comparator.comparingInt;

public class Item42 {

    enum Operation {
        PLUS("+", (x, y) -> x + y),
        MINUS("-", (x, y) -> x -y),
        TIMES("*", (x, y) -> x * y),
        DIVIDE("/", (x, y) -> x / y);

        private final String symbol;
        private final DoubleBinaryOperator op;

        Operation(String symbol, DoubleBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }


        @Override
        public String toString() {
            return symbol;
        }
        public double apply(double x, double y) {
            return op.applyAsDouble(x, y);
        }
    }




    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length())); // 람다식
        Collections.sort(words, comparingInt(String::length)); // 람다 자리에 비교자 생성 메서드를 사용
        words.sort(comparingInt(String::length)); // List에 추가 된 sort
    }
}
