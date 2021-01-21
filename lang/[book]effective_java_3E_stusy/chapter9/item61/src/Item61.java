/**
 * Project : item61
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/22/0022
 * Time: 오전 12:29:09
 */
public class Item61 {
    static Integer i;
    public static void main(String[] args) {
        if (i == 42) {
            System.out.println("믿을 수 없군!");
        }

        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {

            sum += i;
        }

        System.out.println(sum);


    }
}
