package pl.sages.kodolamacz.points;

public class Line {

    private Point start;
    private Point end;

    public double getLength(){
        return start.distanceTo(end);
    }
}
