package pl.sages.kodolamacz.points;

public class Polygon implements HasCircumference {

    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    @Override
    public double getCircumference() {
        return method1();
    }

    private double method1() {
        double sum = 0;

        for (int i = 0; i < points.length - 1; i++) {
            // += jest to samo co x = x + diff;
            sum += points[i].distanceTo(points[i+1]);

        }
        sum += points[points.length-1].distanceTo(points[0]);

        return sum;
    }

    private double method2() {
        double sum = 0;

        for (int i = 0; i < points.length; i++) {
            sum += points[i].distanceTo(points[(i+1)%points.length]);
        }
        return sum;
    }
}
