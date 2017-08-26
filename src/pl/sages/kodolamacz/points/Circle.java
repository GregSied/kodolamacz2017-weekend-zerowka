package pl.sages.kodolamacz.points;

public class Circle implements HasArea, HasCircumference {

    private Point center;
    private double radius;

    // konstruktor generuje koło o promieniu 1 w zadanym punkcie
    public Circle(Point center) {
        this(center, 1.0);
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle one = new Circle(new Point(0,0), 1);
        Circle two = new Circle(new Point(2,2), 1);
        Circle three = new Circle(new Point(2,2), 4);
        System.out.println(one.hasCommonArea(one) == true);
        System.out.println(one.hasCommonArea(two) == false);
        System.out.println(one.hasCommonArea(three) == true);

        System.out.println(three.contains(new Point(3,3)) == true);

    }

    @Override
    public double getArea() {
        //return Math.PI * Math.pow(radius, 2);
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean hasCommonArea(Circle other){
        return this.center.distanceTo(other.center) <= this.radius + other.radius;
    }

    public boolean contains(Point point){
        return center.distanceTo(point) <= radius;
    }


}
