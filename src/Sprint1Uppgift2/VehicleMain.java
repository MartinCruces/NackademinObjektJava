package Sprint1Uppgift2;

import java.awt.*;

public class VehicleMain {
    public void printVehicle(Printable vehicle){
        vehicle.printMe();
    }
    public void printWheels(CarriedByWheels wheels){
        System.out.println("Den har " + wheels.getNumberOfWheels() + " hjul");
    };
    public static void main (String[] arg){
        VehicleMain print = new VehicleMain();
        Train typeTrain1 = new Train(5, 470.5, 200);
        Car typeCar1 = new Car(5, 0, 180, 1856);
        Bike typeBike1 = new Bike(10, 1, 25, 7);
        Boat typeBoat1 = new Boat(25000, 10, 16000);
        typeCar1.gear(3);
        typeBike1.gear(7);
        typeTrain1.changeSpeed(150);

        print.printVehicle(typeCar1);
        print.printWheels(typeCar1);
        print.printVehicle(typeBike1);
        print.printWheels(typeBike1);
        print.printVehicle(typeBoat1);
        print.printVehicle(typeTrain1);
    }
}
