package geometry;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double px, double py) {
        return Math.abs(px - x) <= width/2 &&
                Math.abs(py - y) <= height/2;
    }

    public boolean contains(Rectangle r) {
        return contains(r.x - r.width/2, r.y - r.height/2) &&
                contains(r.x + r.width/2, r.y + r.height/2);
    }

    public boolean overlaps(Rectangle r) {
        return Math.abs(x - r.x) * 2 < (width + r.width) &&
                Math.abs(y - r.y) * 2 < (height + r.height);
    }

    public static void main(String[] args) {
        System.out.println("Task 4: Rectangle");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(0,0,2,2);

        System.out.println(r1.getArea());
        System.out.println(r2.contains(0.5, 0.5));
        System.out.print(r2.overlaps(r1));
    }
}
