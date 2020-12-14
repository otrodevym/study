public class Item17 {
    private double x;
    private double y;

    private Item17(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Item17 valueOf(int x, int y) {
        return new Item17(x, y);
    }
}
