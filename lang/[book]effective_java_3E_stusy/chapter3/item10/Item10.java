import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Item10 {
    // -- 대칭성
    static final class CaseInsensitiveString {
        private final String s;

        public CaseInsensitiveString(String s) {
            this.s = Objects.requireNonNull(s);
        }

        // @Override
        // public boolean equals(Object o) {
        // // 대칭성 위배
        // if (o instanceof CaseInsensitiveString) {
        // return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        // }
        // if (o instanceof String) { // 한방향으로만 동작
        // return s.equalsIgnoreCase((String) o);
        // }
        // return false;
        // }
        @Override
        public boolean equals(Object o) {
            // CaseInsensitiveString과 String과도 연동하도록 하는 생각을 접으면 생기는 소스 String을
            // CaseInsensitiveString으로 형변환
            return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
        }
    }

    // 추이성
    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Point))
                return false;
            Point p = (Point) o;
            return p.x == x && p.y == y;
        }

        // 리스코프 치환 법칙
        private static final Set<Point> unitCircle = Set.of(new Point(1, 0), new Point(0, 1), new Point(-1, 0),
                new Point(0, -1));

        public static boolean onInitCircle(Point p) {
            return unitCircle.contains(p);
        }
    }

//    static class ColorPoint extends Point {
    static class ColorPoint {
        private final Color color;
        private final Point point;

        public ColorPoint(int x, int y, Color color) {
            // super(x, y);
            point = new Point(x, y);
            this.color = Object.requireNonNull(color);
        }

        @Override
        // 대칭성 위배 : Point를 ColorPoint에 비교한 결과와 바꿔 비교한 결과가 다르다.
        public boolean equals(Object o) {
            // if (!(o instanceof ColorPoint))
            // return false;
            // // o가 일반 point면 색상을 무시하고 비교한다.
            // if (!(o instanceof ColorPoint))
            // return o.equals(this);

            if (!(o instanceof Point))
                return false;
            // o가 일반 point면 색상을 무시하고 비교한다.
            if (!(o instanceof SmellPoint))
                return o.equals(this);
            return super.equals(o) && ((SmellPoint) o).color == color;

            // 리스코프 치환 원칙 위배
            // if (o == null || o.getClass() != getClass())
            // return false;
            // Point p = (Point) o;
            // return p.x == x && p.y == y;

            return super.equals(o) && ((ColorPoint) o).color == color;
        }

        static class CountPoint extends Point {
            // 리스코프 치환 법칙 위배 사례
            public CountPoint(int x, int y) {
                super(x, y);
                counter.incrementAndGet();
            }

            private static final AtomicInteger counter = new AtomicInteger();

            public static int numberCreated() {
                return counter.get();
            }
        }

    }

    // -- 반사성
    class Fruit {
        private String name;

        public Fruit(String name) {
            this.name = name;
        }
    }

    class SmellPoint {
        private final int x;
        private final int y;

        public SmellPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        // -- 각 인스턴스가 본질적으로 고유하다.
        // Thread t = new Thread();
        // System.out.println(t.toString());

        // -- 반사성
        List<Fruit> list = new ArrayList<>();
        Fruit f = new Fruit("apple");
        list.add(f);
        list.contains(f); // false 일 경우에는 반사성을 만족하지 못함.

        // -- 대칭성
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        List<CaseInsensitiveString> list2 = new ArrayList<>();

        list2.add(cis);
        System.out.println(list2.contains(s));

        // -- 추이성
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));

        ColorPoint cp1 = new ColorPoint(1, 2, Color.RED);
        Point p1 = new Point(1, 2);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println(cp1.equals(p1) + " : " + p1.equals(cp1) + " : " + cp1.equals(cp2));
        // -- 무한 재귀
        ColorPoint cp3 = new ColorPoint(1, 2, Color.RED);
        SemllPoint cp4 = new SemllPoint(1, 2);
        cp3.equals(cp4); // ColorPoint의 equals로 비교 하면서 SemllPoint로 빠지고 SmellPoint의 equals에서 ColorPoint를
                         // 비교하여 무한 재귀에 빠짐
    }

    @Override
    public boolean equals(Object o) {
        throw new AssertionError(); // 호출 금지
    }

}