import java.util.HashMap;
import java.util.Map;

public class Item43 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        String key = "1";
        map.merge(key, 1, (count, incr) -> count + incr);
        map.merge(key, 1, Integer::sum);
    }
}
