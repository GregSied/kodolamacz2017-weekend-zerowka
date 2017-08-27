package pl.sages.kodolamacz;

import sun.security.provider.SHA;

public interface Shape extends Comparable<Shape> {

    double getArea();

}

abstract class AbstractShape implements Shape{

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getArea(), o.getArea());
    }

}

class Square extends AbstractShape implements Shape{

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

}

class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

}

class Rectangle extends AbstractShape {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle extends AbstractShape{

    double hight;
    double base;

    public Triangle(double hight, double base) {
        this.hight = hight;
        this.base = base;
    }

    @Override
    public double getArea() {
        return hight * base * 0.5;
    }
}

class CustomShape extends AbstractShape{

    private double area;

    public CustomShape(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}