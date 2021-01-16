import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Project : item54
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 2:35:04
 */
public class Item54 {
    public static void main(String[] args) {

    }
    // 최적화 - 빈 컬렉션을 매번 새로 할당하지 않도록 했다.
    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? Collections.emptyList()
                : new ArrayList<>(cheesesInStock);
    }

    // 배열도 null이 아닌 길이가 0인 배열을 반환하라
    public Cheese[] getCheeses() {

        return cheeseInStock.toArray(new Cheese[0]);
    }

    //불변 배열의 방식
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public Cheese[] getCheeses() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    private class Cheese {
    }
}
