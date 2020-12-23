import java.util.Collection;
import java.util.Set;

public class Item26 {
//    private final Collection stamp; // 적시 안하는 경우 : 로 타입
//    private final Collection<Stamp> stamp1; // 적시 하는 경우

    public Item26(Collection stamps) {
        this.stamps = stamps;
    }

//    static int numElementsInCommon(Set s1, Set s2) { // 잘못 된 예 Set이 무엇인지 모른다.
    static int numElementsInCommon(Set<?> s1, Set<?> s2) { // 와일드 카드 타입을 사용하자.
        int result = 0;
        for (Object o1 : s1)
            if(s2.contains(o1))
                result++;
        return result;
    }

    public static void main(String[] args) {
        if (o instanceof Set) {
            Set<?> s = (Set<?>) o;
        }
    }
}
