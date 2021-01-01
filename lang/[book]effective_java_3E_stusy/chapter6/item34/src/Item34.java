import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Item34 {
    enum Planet {
        ERCURY(3.302e+23, 2.439e6),
        VENUS(4.869e+24, 6.042e6),
        EARTH(5.975e+24, 6.378e6);

        private final double mass; // 질량(단위 : 킬로그램)
        private final double radius; // 반지름(단위 : 미터)
        private final double surfaceGravity; // 표면중력(단위 : m / s^2)

        // 중력 상수(단위 m^2 / kg s^2(
        private static final double G = 6.67300E-11;

        // 생성자
        Planet(double mass, double radius) { // 열거 타입 상수 각각을 특정 데이터와 연결지으려면 생성자에서 데이터를 받아 인스턴스 필드에 저장하면 된다.
            this.mass = mass;
            this.radius = radius;
            this.surfaceGravity = G * mass / (radius * radius);
        }

        public double mass() {
            return mass;
        }

        public double radius() {
            return radius;
        }

        public double surfaceGravity() {
            return surfaceGravity;
        }

        public double surfaceWeight(double mass) {
            return mass * surfaceGravity; // F = ma
        }
    }

    enum Operation {
        //        PLUS, MINUS, TIMES, DIVIDE;
        // 상수별 메서드 구현을 활용한 열거 타입. 각 상수에서 자신에 맞게 재정의하는 방법
        PLUS("+") {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            public double apply(double x, double y) {
                return x - y;
            }
        },
        TIMES("*") {
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            public double apply(double x, double y) {
                return x / y;
            }
        };

        private final String symbol;

        Operation(String symbol) {
            this.symbol = symbol;
        }

        public abstract double apply(double x, double y);

        @Override
        public String toString() {
            return symbol;
        }
        //        // 상수가 뜻하는 연산을 수행한다. // 좋은 코드가 아님
//        public double apply(double x, double y) { // 새로운 상수를 추가하면 해당 case문도 추가해야 한다.
//            switch(this) {
//                case PLUS : return x + y;
//                case MINUS : return x - y;
//                case TIMES : return x * y;
//                case DIVIDE : return x / y;
//            }
//            throw new AssertionError("알 수 없는 연산 : " + this); // 나와서는 안되는 에러
//        }

        // 열거 타입용 fromString 메서드 구현하기
//        private static final Map<String, Operation> stringToEnum =
//                Stream.of(values()).collect(
//                        toMap(Object::toString, e -> e));

//        public static Optional<Operation> fromString(String symbol) {
//            return Operation.ofNullable(stringToEnum.get(symbol));
//        }
    }


    enum PayrollDay {
        MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY),
        SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

        private final PayType payType;

        PayrollDay(PayType payType) {
            this.payType = payType;
        }

        int pay(int minutesWorked, int payRate) {
            return payType.pay(minutesWorked, payRate);
        }

        enum PayType {
            WEEKDAY {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
                }
            },
            WEEKEND {
                int overtimePay(int minsWorked, int payRate) {
                    return minsWorked * payRate / 2;
                }
            };

            abstract int overtimePay(int mins, int payRate);

            private static final int MINS_PER_SHIFT = 8 * 60;

            int pay(int minsWorked, int payRate) {
                int basePay = minsWorked * payRate;
                return basePay + overtimePay(minsWorked, payRate);
            }

        }
    }


    public static void main(String args[]) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("%s에서의 무게는 %f이다. &n", p, p.surfaceWeight(mass));


        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
