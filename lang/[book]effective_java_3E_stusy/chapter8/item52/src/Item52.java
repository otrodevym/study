import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Project : item52
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 1:34:46
 */
public class Item52 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i); // remove(Object) : 0 이상의 수를 제거 - 기대하는 동작
            //list.remove(i); // remove(int index) : 지정 된 위치 제거 - 문제가 되는 동작
            list.remove((Integer) i); // 형변환
        }
        System.out.println(set + " " + list); // [-3, -2, -1] [-2, 0, 2]
    }
}