package Sprint1.Sprint1Uppgift1;

public class MainCarRegistry {
    public static void main (String [] args){
        Car car1 = new Car("AFD342", "Ford", "Focus");
        Car car2 = new Car("HGL350", "Honda", "Accord");
        Car car3 = new Car("TWV017", "Dodge", "Ram");
        CarOwner owner1= new CarOwner("Martin Cruces", "Sufflettvägen 15", 46);
        CarOwner owner2= new CarOwner("Elisabet Svensson", "Sveavägen 22", 61);
        CarOwner owner3= new CarOwner("Nisse Larsen", "Skogsvägen 1", 32);
        car1.ownerOfCar(owner1);
        car2.ownerOfCar(owner2);
        car1.noOwner();
        car3.ownerOfCar(owner3);


        System.out.println( car2.brand + " med registreringsnummer " + car2.getRegNr() + " tillhör " +
                car2.getOwnerOfCar().getName());

    }
}
