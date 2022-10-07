package Sprint1Inlämningsuppgift;
//Interface för utskrifter och näringsvariabler till de olika subklasserna för växter.

public interface Nutrition {

    double mineralWater = 0.2;
    double tapWater = 0.5;

    double liquidBaseProtein = 0.1;

    double extraProtein =0.2;

    void printNutrients();

    default double getMineralWater(){
        return mineralWater;
    }

    default double getTapWater(){
        return tapWater;
    }

    default double getLiquidBaseProtein(){
        return liquidBaseProtein;
    }

    default double getExtraProtein(){
        return extraProtein;
    }
}
