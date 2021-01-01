public class Item38 {
    private final String type;
    private Item38(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
    public static final Item38 x = new Item38("x");
    public static final Item38 y = new Item38("y");
    public static final Item38 z = new Item38("z");
}
