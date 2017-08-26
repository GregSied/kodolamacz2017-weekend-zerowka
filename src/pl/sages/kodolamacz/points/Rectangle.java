package pl.sages.kodolamacz.points;

public class Rectangle implements HasArea, HasCircumference {

    private Point leftBottom;
    private Point rightUpper;

    public Rectangle(Point leftBottom, Point rightUpper) {
        this.leftBottom = leftBottom;
        this.rightUpper = rightUpper;
    }

    @Override
    public double getArea() {
        return getDiffX() * getDiffY();
    }

    @Override
    public double getCircumference() {
        return 2 * getDiffX() + 2 * getDiffY();
    }

//    public boolean hasCommonArea(Rectangle other){
//
//    }

    private double getDiffX() {
        return rightUpper.getX() - leftBottom.getX();
    }

    private double getDiffY() {
        return rightUpper.getY() - leftBottom.getY();
    }
}
