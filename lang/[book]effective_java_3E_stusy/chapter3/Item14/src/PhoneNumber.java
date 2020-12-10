import java.util.Comparator;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

//    public int compareTo(PhoneNumber pn) {
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0) {
//                result = Short.compare(lineNum, pn.lineNum);
//            }
//        }
//        return result;
//    }

    private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt(
            (PhoneNumber pn) -> pn.areaCode)
            .thenComparing(pn -> pn.prefix)
            .thenComparing(pn -> pn.lineNum);
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

//    static Comparator<Object> hashCodeOrder = new Comparator<Object>() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return o1.hashCode() - o2.hashCode();
//        }
//    };

//    static Comparator<Object> hashCodeOrder = new Comparator<Object>() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return Integer.compare(o1.hashCode(), o2.hashCode());
//        }
//    };

    static Comparator<Object> hashCodeOrder = Comparator.comparingInt(o -> o.hashCode());


}
