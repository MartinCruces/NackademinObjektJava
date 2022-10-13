package Sprint1.Sprint1Uppgift2;

public class Bike extends Vehicle implements CarriedByWheels{
    private int totalGears;
    private int currentGear = 1;
    final int numberOfWheels = 2;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Bike (int totalGears, int currentGear, double speed, double weight ){
        super(speed, weight);
        this.totalGears = totalGears;
        this.currentGear = currentGear;
    }

    public void gear(int newGear){
        if (newGear <= 0 || newGear > totalGears){
            System.out.println("Cyckeln har inte den växeln");
        }
        else {
            currentGear = newGear;
        }

    }

    public int getTotalGears() {
        return totalGears;
    }
    public int getCurrentGear() {
        return currentGear;
    }


    @Override
    public void printMe() {
        System.out.println("Cyckelns hastighet är " + getSpeed() + " km/t" +
                "\nCyckelns vikt är " + getWeight() +  " kg" + "\nCyckeln har " + totalGears + " växlar" +
                "\nCyckelns nuvarande växel är:" + currentGear);
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
