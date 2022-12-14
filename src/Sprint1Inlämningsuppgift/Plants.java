package Sprint1Inlämningsuppgift;

//Plants är en abstrakt superklass till respektive art-subklassrna. Subklasserna ärver namn och höjd som alla växterna har.
public abstract class Plants {
     private String namePlant;
     private double height;

    public Plants(){}

    public Plants(String namePlant, Double height){
        this.namePlant = namePlant;
        this.height = height;
    }
    public String getNamePlant() {
        return namePlant;
    }
    public Double getHeight() {
        return height;
    }
}
