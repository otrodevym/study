import java.util.List;

/**
 * Project : item52
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 1:52:03
 */
public class Overriding {
    public static void main(String[] args) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : wineList)
            System.out.println(wine.name());
    }
}

    class Wine {
        String name() {
            return "포도주";
        }
    }

    class SparklingWine extends Wine {
        @Override
        String name() {
            return "발포성 포도주";
        }
    }

    class Champagne extends SparklingWine {
        @Override
        String name() {
            return "샴페인";
        }
    }
