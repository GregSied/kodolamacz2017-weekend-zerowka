package pl.sages.kodolamacz.interfejs;

public class Circle implements Shape {

    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
