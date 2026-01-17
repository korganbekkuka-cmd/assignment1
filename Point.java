package geometry;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(
                Math.pow(this.x - p.x, 2) +
                        Math.pow(this.y - p.y, 2)
        );
    }

    public double distance(double x, double y) {
        return Math.sqrt(
                Math.pow(this.x - x, 2) +
                        Math.pow(this.y - y, 2)
        );
    }

    public static void main(String[] args) {
        Point p1 = new Point(-3, -4);
        Point p2 = new Point(3, 4);

        System.out.println("Task 1: Point");

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Distance p1 to p2: " + p1.distance(p2));
        System.out.print("Distance p2 to (0,0): " + p2.distance(0, 0));
    }
}
