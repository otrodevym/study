/**
 * Project : item63
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/22/0022
 * Time: 오후 10:05:35
 */
public class Item63 {
    public String statement() {
        String result = "";
        for (int i = 0; i < numItems(); i++)
            result += lineForItem(i);
        return result;
    }
    public String statement2() {
        StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
        for (int i = 0; i < numItems(); i++)
            b.append(lineForItem(i));

        return b.toString();
    }

    public static void main(String[] args) {

    }
}
