import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Item15 {
    private static final Thing[] PRIVATE_VALUES = {new Thing(1)};
    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }

//    public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));


    static class Thing {
        private int t;

        public Thing(int t) {
            this.t = t;
        }
    }
}

