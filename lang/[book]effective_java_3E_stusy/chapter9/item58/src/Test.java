import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Project : item58
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/21/0021
 * Time: 오후 3:39:51
 */
public class Test {
    enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }

    public static void main(String[] args) {
        Collection<Face> faces = EnumSet.allOf(Face.class);
        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println(i.next() + " " + j.next());

        for (Iterator<Face> i = faces.iterator(); i.hasNext(); ) {
            Face f = i.next();
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
                    System.out.println(f + " " + j.next());
            }
        }

    }
}
