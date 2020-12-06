import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Item1 {
    public static void main(String[] args) {
        // System.out.println("hello");
        // -- p.9
        // System.out.println(item1.valuOf(true));

        // -- p.10
        // Collections.

        // -- p.12
        // ServiceLoader.

        // -- p.12
        Date d = Date.from(instant);
        Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        StackWalker luke = StackWalker.getInstance(option);
        Object newArray = Array.newInstance(classObject, arrayLen);
        FileStore fs = Files.getFileStore(path);
        BufferedReader br = Files.newBufferedReader(path);
        List<Complaint> litany = Collections.list(legacyLitany);

    }

    public static Boolean valuOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}