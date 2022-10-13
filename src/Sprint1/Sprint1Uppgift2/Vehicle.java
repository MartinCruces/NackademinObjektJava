package Sprint1.Sprint1Uppgift2;

public abstract class Vehicle implements Printable {
    private double speed;
    private double weight;

    public Vehicle(){}
    public Vehicle(Double speed, Double weight){
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public void changeSpeed(double newSpeed){
        speed = newSpeed;

    }

}
