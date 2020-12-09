import java.awt.*;

//public class ColorPoint extends Point{
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = color;
    }

    public Point aspoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) obj;
     return cp.point.equals(point) && cp.color.equals(color);
    }
}
