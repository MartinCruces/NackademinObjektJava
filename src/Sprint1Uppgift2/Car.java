package Sprint1Uppgift2;

public class Car extends Vehicle implements CarriedByWheels{
    private int totalGears;
    private int currentGear;
    final int numberOfWheels = 4;

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Car (int totalGears, int currentGear, double speed, double weight ){
        super(speed, weight);
        this.totalGears = totalGears;
        this.currentGear = currentGear;

    }

    public void gear(int newGear){
        if (newGear <= totalGears){
            currentGear = newGear;
        }
        else {
            System.out.println("Bilen har inte den växeln");
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
        System.out.println("Bilens hastighet är " + getSpeed() + " km/t" +
                "\nBilens vikt är " + getWeight() +  " kg" + "\nBilen har " + totalGears + " växlar" +
                "\nBilens nuvarande växel är:" + currentGear);
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
