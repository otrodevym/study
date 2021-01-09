import jdk.dynalink.Operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.time.chrono.JapaneseEra.values;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Item46 {
    public static void main(String[] args) {
//        Map<String, Long> freq = new HashMap<>();
//        try(Stream<String> words = new Scanner(file).tokens()) { // 스트림 패러다임으 이해하지 못한 채 API만 사용했다. 따라하지 말것
//            words.forEach(word -> { // 연산 결과를 보여주는 일 이상을 하는 forEach를 보니 나쁜 코드일 것 같은 냄새
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//        }

        Map<String, Long> freq;
        /*
        try(Stream<String> words = new Scanner(file).tokens()) {
            freq = words.collect(groupingBy(String::toLowerCase, counting()));
        }*/

//        List<String> toTen = freq.keySet().stream()
//                .sorted(comparing(freq::get).reversed())
//                .limit(10)
//                .collect(toList());


//        Map<Artist, Album> toHits = albums.collect(
//                toMap(Album::artist, a->a, maxBy(comparing(Album::sales)));

    }

//    private static final Map<String, Operation> stringToenum =
//            Stream.of(values()).collect(
//                    toMap(Object::toString, e -> e));


}
