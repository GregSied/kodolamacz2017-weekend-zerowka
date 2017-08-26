package pl.sages.kodolamacz.interfejs;

public class InterfaceExample {

    public static void main(String[] args) {
        double b = 2;
        double a = 5;
        Shape shape = new Rectangle(b,a);
        System.out.println(shape.getArea());

        Shape circle = new Circle(4);
        System.out.println(circle.getArea());

    }

}
