package geometry;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy) <= radius;
    }

    public boolean contains(Circle c) {
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance + c.radius <= this.radius;
    }

    public boolean overlaps(Circle c) {
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < this.radius + c.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1, 1, 2);

        System.out.println("Task 2: Circle");

        System.out.println(c1.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c1.contains(0, 0));
        System.out.println(c2.contains(c1));
        System.out.print(c1.overlaps(c2));
    }
}