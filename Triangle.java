package geometry;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this(new Point(0,0), new Point(1,1), new Point(2,5));
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }

    public void setP1(Point p) { p1 = p; }
    public void setP2(Point p) { p2 = p; }
    public void setP3(Point p) { p3 = p; }

    private double area(Point a, Point b, Point c) {
        return Math.abs(
                (a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY())) / 2.0
        );
    }

    public double getArea() {
        return area(p1, p2, p3);
    }

    public double getPerimeter() {
        return dist(p1, p2) + dist(p2, p3) + dist(p3, p1);
    }

    private double dist(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2));
    }

    public boolean contains(Point p) {
        double total = getArea();
        double a1 = area(p, p2, p3);
        double a2 = area(p1, p, p3);
        double a3 = area(p1, p2, p);
        return Math.abs(total - (a1 + a2 + a3)) < 0.0001;
    }

    public boolean contains(Triangle t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle t) {
        return contains(t.p1) || contains(t.p2) || contains(t.p3);
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(
                new Point(0,0),
                new Point(1,0),
                new Point(0,1)
        );

        System.out.println("Task 3: Triangle");

        System.out.println(t1.getArea());
        System.out.println(t2.getPerimeter());
        System.out.println(t1.contains(new Point(1,1)));
        System.out.print(t1.overlaps(t2));
    }
}
