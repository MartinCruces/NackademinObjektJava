package Sprint2.Uppgift1;

public class Circle implements Figure {
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double getCircumference() {
        return Math.PI*(radius + radius);
    }
}
