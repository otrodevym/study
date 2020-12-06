import java.util.regex.Pattern;

public class Item6 {
    public static void main(String[] args) {
        String s = new String("bikini"); // 사용 하지 말자
        String ss = "bikini"; // 하나의 인스턴스를 사용하는 방법

        Boolean b = new Boolean("true"); // 비권장 API
        Boolean bb = Boolean.valueOf("true"); // 권장 API

    }

    // static boolean isRoamnNumeral(String s) {
    // return s.matches("^(?=.>M*(C[MD]|D?C{0,3})" +
    // "(X[CL]|L?X{0,3})(I[XV]|V/I{0,3})$");
    // }

    private static final Pattern ROMAN = Pattern
            .compile("^(?=.>M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V/I{0,3})$");

    static boolean isRoamnNumeral(String s) {
        return ROMAN.matcher(s);
    }

    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}