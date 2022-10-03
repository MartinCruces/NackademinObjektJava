package Sprint1Inlämningsuppgift;

public class Plants {
    private String namePlant;
    private Double height;

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
