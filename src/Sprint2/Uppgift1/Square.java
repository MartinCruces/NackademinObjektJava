package Sprint2.Uppgift1;

public class Square implements Figure {
    protected double height;
    protected double width;

    public Square(double height, double width){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return width*2 + height*2;
    }
}
