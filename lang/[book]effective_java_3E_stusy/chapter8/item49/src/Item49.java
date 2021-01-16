import java.math.BigInteger;
import java.util.Objects;

/**
 * Project : item49
 * Create by IntelliJ IDEA
 * User: hwesd
 * Date: 2021/1/12/0012
 * Time: 오후 9:19:41
 */
public class Item49 {
    /**
     * (현재 값 mod m) 값을 반환한다. 이 메서드는
     * 항상 음이 아닌 BigInteger를 반환한다는 점에서 remainder 메서드와 다르다.
     *
     * @param m 계수(양수여야 한다.)
     * @return 현재 값 mod m
     * @throws ArithmeticException m이 0보다 작거나 같으면 발생한다.
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0) {
            throw new ArithmeticException("계수 (m)는 향수여야 합니다. " + m);
        }

        return null;
    }
    
    private static void test(int a, int b, int c) {
        assert a != 0;
        assert b >= 0;
        System.out.println("테스트");
    }

    public static void main(String[] args) {

//        System.out.println(Objects.requireNonNull(null, "null임").toString());

        test(10,10,10);
        test(0,10,10);
        test(10,-10,10);
    }
}
