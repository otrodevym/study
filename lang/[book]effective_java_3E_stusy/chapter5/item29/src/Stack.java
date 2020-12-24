import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Locale;

public class Stack<E> {
//    private E[] elements;
    private Object[] elements; // 방법 2. Object로 받으면 pop에서 꺼낼 때 형변환이 안전하지 않아 비검사 형변환 오류가 난다.
    private int size;
    private static final int DEFAULT_INNITAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
//        this.elements = new E[DEFAULT_INNITAL_CAPACITY];
        this.elements = (E[]) new Object[DEFAULT_INNITAL_CAPACITY]; // 방법1. 항상 E이므로 비검사 형변환은 확실히 안전하다.
    }


    public void push(E e) {
        ensurCapacity();
        elements[size++] = e;
    }

    private void ensurCapacity() {
        if (elements.length == this.size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public E pop() {
        if (size ==0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size]; // Object에서 꺼낼 때 항상 E이므로 비검사 형변환도 확실히 안전하다.
        elements[size] = null;
        return result;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase(Locale.ROOT));
        }

    }
}
