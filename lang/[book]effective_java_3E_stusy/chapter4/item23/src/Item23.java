public class Item23 {
    abstract class Figure {
        abstract double area();
    }

    class Circle extends Figure {
        final double radius;
        Circle(double radius) { this.radius = radius; }

        @Override
        double area() {
            return Math.PI * (radius * radius);
        }
    }

    class Rectangle extends Figure {
        final double lenth;
        final double width;

        Rectangle(double lenth, double width) {
            this.lenth = lenth;
            this.width = width;
        }


        @Override
        double area() {
            return lenth * width;
        }
    }
}
