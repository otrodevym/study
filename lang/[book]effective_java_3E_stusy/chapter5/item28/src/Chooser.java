import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
//    private final Object[] choiceArray;
    private final List<T> choiceArray;

    public Chooser(Collection<T> choices) {
//        this.choiceArray = choices.toArray();
        this.choiceArray = new ArrayList<>(choices);
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray.get(rnd.nextInt(choiceArray.size()));
    }
}
