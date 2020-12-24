import java.util.List;

public class Item31 {
    public void pushAll(Iterable<? extends E> src){
        for (E e : src)
            push(e);
    }
    public void popAll(Collection<? super E> det) {
        while (!isEmpty())
            det.add(pop());
    }

    public static <E> void swap(List<E> list, int i, int j){

    }

    public static void swap(List<?> list, int i, int j) {

    }


    public static void swap(List<?> list, int i, int j) {
//        list.set(i, list.set(j, list.get(i))); // 컴파일 오류
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
}
