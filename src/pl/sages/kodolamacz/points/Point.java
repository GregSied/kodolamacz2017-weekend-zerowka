package pl.sages.kodolamacz.points;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point zero = new Point(0,0);
        Point one = new Point(1,1);
        Point two = new Point(4,5);

        System.out.println(zero.distanceTo(one));
        System.out.println(two.distanceTo(one));
        // czy odległość z a do b jest taka sama jak z b do a
        System.out.println(two.distanceTo(one) == one.distanceTo(two));
        // odległość punktu od samego siebie wynosi 0
        System.out.println(one.distanceTo(one) == 0.0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other){
        double diffX = this.x - other.x;
        double diffY = this.y - other.y;
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }
}
