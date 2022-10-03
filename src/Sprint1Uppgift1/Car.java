package Sprint1Uppgift1;

public class Car {
    protected String regNr;
    protected String brand;
    protected String model;
    protected CarOwner owner;
    public Car (String regNr, String brand, String model){
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
    }
    public void ownerOfCar(CarOwner nextOwner){
        owner = nextOwner;
    }
    public void noOwner(){
        owner = null;
    }
    public CarOwner getOwnerOfCar(){
        return owner;
    }
    public String getRegNr(){
        return regNr;
    }



}
