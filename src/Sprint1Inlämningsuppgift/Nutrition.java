package Sprint1Inlämningsuppgift;
//Interface för utskrifter till de olika subklasserna för växter.
// Det är samma metod används i varje klass men genererar olika resutlat beroende på vilket
//objekt som anropar den och är ett exempel på polymorfism.

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
