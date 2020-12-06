import java.util.Arrays;
import java.util.EmptyStackException;

public class Item7 {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INTTIAL_CAPACITY = 16;

    public Item7() {
        elements = new Object[DEFAULT_INTTIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        OBject result = elements[--size];
        elements[size] = null;
        return result;
        // return elements[--size];;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
