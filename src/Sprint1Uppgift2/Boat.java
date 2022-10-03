package Sprint1Uppgift2;

public class Boat extends Vehicle{

    private double deadWeight;


    public Boat(double deadWeight, double speed, double weight){
        super(speed, weight);
        this.deadWeight = deadWeight;
    }
    public double getDeadWeight() {
        return deadWeight;
    }

    public void turn(){}

    @Override
    public void printMe() {
        System.out.println("Båtens hastighet är " + getSpeed() + " knop" +
                "\nBåtens vikt är " + getWeight() +  " ton" + "\nBåtens dödvikt är " + deadWeight);
    }



}
