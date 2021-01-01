import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Item37 {
    static class Plant {
        enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }
        final String name;
        final LifeCycle lifeCycle;

        Plant(String name, LifeCycle lifeCycle) {
            this.name = name;
            this.lifeCycle = lifeCycle;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
////        List<Plant> garden = new ArrayList<>();
//
////        ordinal()을 배열 인덱스로 사용 - 따라하지 말것
//        Set<Plant>[] plantByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
//        for (int i = 0; i < plantByLifeCycle.length; i++) {
//            plantByLifeCycle[i] = new HashSet<>();
//        }
//        for (Plant p : garden) { // garden은 없는 구현체, Plant를 담은 객체
//            plantByLifeCycle[p.lifeCycle.ordinal()].add(p);
//        }
//        for (int i = 0; i < plantByLifeCycle.length; i++) {
//            System.out.printf("%s: %s %n", Plant.LifeCycle.values()[i], plantByLifeCycle[i]);
//        }
//
//        // EnumMap을 사용해 데이터와 열거 타입을 매핑한다.
//        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
//        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
//            plantsByLifeCycle.put(lc, new HashSet<>());
//        for (Plant p : garden)
//            plantsByLifeCycle.get(p.lifeCycle).add(p);
//        System.out.println(plantsByLifeCycle);
//
//        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.liefCycle))); // EnumMap을 사용하지 않은 경우
//        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), toSet())));
    }

}
