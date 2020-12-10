import java.util.HashMap;
import java.util.Map;

public class Item11 {
    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "제너");
        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }
}
