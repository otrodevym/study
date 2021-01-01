import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public enum Phase {
    SOLID, LIQUID, GAS, PLASMA;

    public enum Transition {
        //        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID), IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);

        //        private static final Transition[][] TRANSITIONS = {
//                {null, MELT, SUBLIME},
//                {FREEZE, null, BOIL},
//                {DEPOSIT, CONDENSE, null}
//        };

        //        public static Transition from(Phase from, Phase to) {
//            return TRANSITIONS[from.ordinal()][to.ordinal()];
//        }
        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

        private static final Map<Phase, Map<Phase, Transition>> m = Stream.of(values()).collect(groupingBy(t -> t.from, () -> new EnumMap<>(Phase.class), toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class))));

        public static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }

    }
}
