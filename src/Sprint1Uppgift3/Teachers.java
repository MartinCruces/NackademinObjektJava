package Sprint1Uppgift3;


import java.util.List;

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
