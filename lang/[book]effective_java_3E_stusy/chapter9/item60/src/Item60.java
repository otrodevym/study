import java.math.BigDecimal;

/**
 * Project : item60
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/22/0022
 * Time: 오전 12:17:56
 */
public class Item60 {
    public static void main(String[] args) {
        final BigDecimal TEN_DENTS = new BigDecimal(".10");

        int itemBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_DENTS;
            funds.compareTo(price) >= 0;
            price = price.add(TEN_DENTS)) {
            funds = funds.subtract(price);
            itemBought++;
        }
        System.out.println(itemBought + "개 구입");
        System.out.println("잔돈(달러) : " + funds);

        int itemBought2 = 0;
        int funds2 = 100;
        for (int price = 10; funds2 >= price; price += 10) {
            funds2 -= price;
            itemBought2++;
        }
        System.out.println(itemBought + "개 구입");
        System.out.println("잔돈(센트): " + funds);

    }
}
