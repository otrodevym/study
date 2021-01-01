import java.util.HashSet;
import java.util.Set;

public class Item40 {
    private final char first;
    private final char second;

    public Item40(char first, char second) {
        this.first = first;
        this.second = second;
    }
    @Override
//    public boolean equals(Item40 i) {
    public boolean equals(Object o) {
        if (!(o instanceof Item40)) {
            return false;
        }
        Item40 i = (Item40) o;
        return i.first == this.first && i.second == this.second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Item40> b = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                b.add(new Item40(ch, ch));
            }
            System.out.println(b.size());
        }
    }
}
