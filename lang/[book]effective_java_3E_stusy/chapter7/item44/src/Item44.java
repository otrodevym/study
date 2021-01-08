import java.util.Map;

public class Item44 {
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > 100;
    }
    @FunctionalInterface interface EldestEntryRemovalFunction<K,V>{ // 잘 동작하지만 사용할 이유가 없다.
        boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
    }

    public static void main(String[] args) {

    }
}
