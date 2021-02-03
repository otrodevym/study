/**
 * Project : item84
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/2/3/0003
 * Time: 오전 12:56:11
 */
public class Item84 {
    private int count;

    public Item84(int count) {
        if (count < 0)
            throw new IllegalArgumentException(count + " < 0");
        this.count = count;
    }

    public void await() {
        while (true) {
            synchronized (this) {
                if (count == 0)
                    return ;
            }
        }
    }

    public synchronized void countDown() {
        if (count != 0)
            count--;
    }

    public static void main(String[] args) {

    }
}
