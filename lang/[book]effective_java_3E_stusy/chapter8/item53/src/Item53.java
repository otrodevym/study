/**
 * Project : item53
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 2:21:23
 */
public class Item53 {
    static int sum(int... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");
        }
        int min = args[0];
        int sum = 0;
//        for (int arg : args) {
        for (int i = 1; i < args.length; i++) { // 잘못구현한 예
                if(args[i] < min)
                    min = args[i];
        }
        return min;
    }

    static int min(int firstArg, int... args) {
        int min = firstArg;
        for (int arg : args) {
            if (arg < min)
                min = arg;
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
