import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        String[] ss = new String[]{};
        Stack s = new Stack(ss);
        s.push("asd");

        String[] ss2 = new String[]{};
        Stack sss = new Stack(ss2);
            sss = s.clone();
        sss.push("zxc1");
        sss.push("zxc2");
        sss.push("zxc3");
        sss.push("zxc4");
        System.out.println(s.pop());
        System.out.println(sss.pop());
    }
}
