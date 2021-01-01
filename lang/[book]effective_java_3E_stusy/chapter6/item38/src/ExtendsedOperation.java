import java.util.Arrays;

public enum ExtendsedOperation implements Operation{
    EXP("^") { public double apply(double x, double y) { return Math.pow(x, y); } },
    REMAINDER("%") { public double apply(double x, double y) { return x % y; }};

    private final String symbol;

    ExtendsedOperation(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        test(ExtendedOperation.class, x, y); // 첫 번째 방법
        test(Arrays.asList(ExtendsedOperation.values()), x, y); // 두 번째 방법
    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.println("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
