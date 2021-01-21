import java.io.IOException;
import java.io.InputStream;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * Project : item59
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/21/0021
 * Time: 오후 8:50:23
 */
public class Item59 {

    static Random rnd = new Random();
    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }
    public static void main(String[] args) throws IOException {
        try(InputStream in = new URL(args[0]).openStream()){
            in.transferTo(System.out);
        }
    }
}
