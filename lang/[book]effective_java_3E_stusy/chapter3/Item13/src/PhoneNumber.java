import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        if(obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    // 공변성
    public static List<Character> firstChars(List<? extends CharSequence> list ) {
        return list.stream().map(cs -> cs.charAt(0)).collect(Collectors.toList());
    }


    static class Test {
    public void printCollectionGen(Collection<Object>collection) {
        for (Object e : collection) {
            System.out.println(e);
        }
    }

        public Test() {
        }
    }

    public static void main(String[] args) {
        // 공변성
        // 파라미터에는 사용할 수 없다.
        List<? extends String> list = new ArrayList<String>();
        String first = list.get(0);
//        list.add("abc"); // 컴파일 에러, String 변수를 인자로 넘길 수 없다.
        // 반공변성
        // 반환 타입에는 사용할 수 없다.
        List<? super String> list2 = new ArrayList<String>();
//        String first2 = list2.get(0); // 컴파일 에러, String 반환 타입을 사용할 수 없다.
        list2.add("Test"); // String 변수를 인자로 넘길 수 있다.

        Test t = new Test();
        List<String> s = new ArrayList<>();
        s.add("Test");
//        t.printCollectionGen(s); // 컴파일 오류
    }
}
