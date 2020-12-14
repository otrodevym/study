import java.util.*;

//public class InstrumentedHashSet<E> extends HashSet<E> {
public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s) {
        super(s);
    }
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>(ss);
//        s.addAll(Arrays.asList("A","DD","QQ"));
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}
