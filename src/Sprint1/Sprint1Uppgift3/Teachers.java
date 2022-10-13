package Sprint1.Sprint1Uppgift3;


public class Teachers extends Person {

    //protected List<Class> teachesClass;

     public Teachers(String name, String age){
         super(name, age);
     }
     public String getName(){
         return name;
     }
     public void addTeacher(Class course){
        //teachesClass.add(course);
     }
     public void deleteTeacher(Class course){
         //teachesClass.remove(course);
     }
}
