package Sprint1.Sprint1Uppgift6;

public class Mammals extends Animal{
    String name;
    String sound;
    public Mammals(String name, String sound){
        super(name, sound);
        this.name = name;
        this.sound = sound;

    }

    @Override
    public String animalSound() {
        return null;
    }
}
