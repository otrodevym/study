import javax.lang.model.util.Elements;
import javax.swing.text.Element;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project : item55
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 2:55:49
 */
public class Item55<E> {
    public static <E extends Comparable<E>>Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return Optional.of(result);
    }
    public static void main(String[] args) {
        String lastWordInLexicon = max(words).orElse("단어 없음"); // 활용 1 : 기본 값 지정
        Toy myToy = max(toys).orElseThrow(TemperTranTrumException::new); // 활용 2 : 예외를 던지기
        Element lastNobleGas = max(Elements.NOBLE_GASES).get(); // 활용 3 : 항상 값이 채워져 있다고 가정


        Optional<String> parentProcess = Optional.of("Test");
        System.out.println(parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A");

        System.out.println(parentProcess.map(h -> String.valueOf(h.pid())).orElse("N/A"));


//        Stream<String> streamOfOptionals = Stream.of("test");
        streamOfOptionals.filter(Optional::isPresent).map(Optional::get)

    }
}
