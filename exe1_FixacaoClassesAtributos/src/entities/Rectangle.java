package entities;

public class Rectangle {

    public double width;

    public double heidth;

    public double area(){
    return width * heidth;
    }

    public double perimeter(){
        return 2 * (width * heidth);
    }

    public double diagonal(){
        return Math.sqrt(width * width + heidth * heidth);
    }
}
