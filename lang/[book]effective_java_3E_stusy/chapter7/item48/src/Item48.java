import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

public class Item48 {
    public static void main(String[] args) {
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(2)
                .forEach(System.out::println);
    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    static long pi(long n) { // 소수 계산 스트림 파이프라인 - 병렬화에 적합하다.
//        return LongStream.rangeClosed(2, n)
//                .mapToObj(BigInteger::valueOf)
//                .filter(i -> i.isProbablePrime(50))
//                .count();
        // 병렬화
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

}
