package Sprint2.Uppgift1;

public class Triangle implements Figure {
    public double height;
    public double width;

    public Triangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double hypotenuse(){
       return Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2));

    }
    @Override
    public double getArea() {
        return (width*height)/2;
    }

    @Override
    public double getCircumference() {
        return hypotenuse()*2 + width;
    }
}
