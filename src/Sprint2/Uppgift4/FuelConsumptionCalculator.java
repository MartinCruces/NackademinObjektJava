package Sprint2.Uppgift4;

public class FuelConsumptionCalculator {




    protected double milesLastYear;
    protected double currentMiles;
    protected double litre;

    public FuelConsumptionCalculator(){}
    public FuelConsumptionCalculator(double milesLastYear, double currentMiles, double litre){
        this.milesLastYear = milesLastYear;
        this.currentMiles = currentMiles;
        this.litre = litre;
    }
    public double calMiles (){
        return currentMiles-milesLastYear;

    }
    public double calFuelConsumption(){
        return litre/calMiles();
    }

    public String printCalMiles(){
        return "Antal körda mil: " + calMiles();
    }
    public String printLitre(){
        return "Antal liter bränsle: " + litre;
    }
    public String printFuelConsumption(){
        return "Förbrukning liter/mil: " + calFuelConsumption();
    }

}
