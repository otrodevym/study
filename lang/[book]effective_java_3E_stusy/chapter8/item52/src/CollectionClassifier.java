import java.math.BigInteger;
import java.util.*;

/**
 * Project : item52
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 1:35:32
 */
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "집합";
    }

    public static String classify(List<?> list) {
        return "리스트";
    }

    public static String classify(Collection<?> c) {
//        return "그 외";
        return c instanceof Set ? "집합" : c instanceof List ? "리스트" : "그 외"; // 의도한 대로 동작하기 위한 조치
    }


    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }
    }
}
