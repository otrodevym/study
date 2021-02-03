import java.util.concurrent.TimeUnit;

/**
 * Project : item78
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/2/2/0002
 * Time: 오후 9:32:04
 */
public class Item78 {
//    private static boolean stopRequested;
    private static volatile boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
//            while (!stopRequested())
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
//        requestStop();
    }
}
