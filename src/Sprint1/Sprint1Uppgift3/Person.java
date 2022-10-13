package Sprint1.Sprint1Uppgift3;

public class Person {
    protected String name;
    protected String age;


    public Person(){}
    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
