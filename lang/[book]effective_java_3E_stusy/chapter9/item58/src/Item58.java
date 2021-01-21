import javax.swing.text.Element;
import java.util.*;

/**
 * Project : item58
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/20/0020
 * Time: 오후 6:45:12
 */
public class Item58 {
    enum Suit {
        CLUB("1"), DIAMOND("2"), HEART("3"), SPADE("4");

        private String idx;
        Suit(String idx) {
            this.idx = idx;
        }
    }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    public static void main(String[] args) {
//        List<Element> list = new ArrayList<>();
//        // for문으로 컬렉션을 순회하는 코드
//        for (Iterator<Element> i = list.iterator(); i.hasNext(); ) {
//            Element e = i.next();
//        }
//
//        // 전통적인 for문으로 배열을 순회하는 코드
//        for (int i = 0; i < list.size(); i++) {
//
//        }
//
//        for (Element e : // ':' 은 in 이라고 읽으면 된다
//                list) {
//            System.out.println(e.toString());
//        }


        List<Card> deck = new ArrayList<>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext();){
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();){
                deck.add(new Card(i.next(), j.next())); // next는 숫자 하나당 한 번씩만 불러야 한다
            }
        }



    }

    private static class Card {
        public Card(Suit next, Rank next1) {
        }
    }
}

