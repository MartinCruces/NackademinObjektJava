package Sprint1Uppgift2;

public class Train extends Vehicle implements CarriedByWheels{
    private int trainCarts;

    public int getTrainCarts() {
        return trainCarts;
    }

    public Train(int trainCarts, double speed, double weight){
        super(weight, speed);
        this.trainCarts = trainCarts;
    }
    public void changeCart(int newCart){
        trainCarts = newCart;
    }


    @Override
    public void printMe() {
        System.out.println("Tågets hastighet är " + getSpeed() + " km/t" +
                "\nTågets vikt är " + getWeight() +  " ton" + "\nTåget har " + trainCarts + " vagnar");
    }

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}
