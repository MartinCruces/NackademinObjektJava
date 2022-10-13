package Sprint1.Sprint1Uppgift3;

import java.util.ArrayList;
import java.util.List;

public class ClassList {
    ClassList (){
        Students student1 = new Students("Nils Gök", "23");
        Students student2 = new Students("Anna Larsson", "32");
        Students student3 = new Students("Petra Ohlsson", "25");
        Students student4 = new Students("Bert Kurri", "45");

        Teachers teacher1 = new Teachers("Görel", "Albertsson");
        Teachers teacher2 = new Teachers("Matthias", "Granskog");

        Class course1 = new Class("Engelska");
        Class course2 = new Class("Svenska");
        Class course3 = new Class("Matematik");


        teacher1.addTeacher(course1);
        teacher1.addTeacher(course3);
        teacher2.addTeacher(course2);

        List<Students> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);

        Participants attendance1 = new Participants(course1, student1);
        Participants attendance2 = new Participants(course1, student2);
        Participants attendance3 = new Participants(course2, student1);
        Participants attendance4 = new Participants(course3, student3);
        Participants attendance5 = new Participants(course3, student4);
        Participants attendance6 = new Participants(course3, student1);
        Participants attendance7 = new Participants(course3, student2);

        List<Participants> allParticipants = new ArrayList<>();
        allParticipants.add(attendance1);
        allParticipants.add(attendance2);
        allParticipants.add(attendance3);
        allParticipants.add(attendance4);
        allParticipants.add(attendance5);
        allParticipants.add(attendance6);
        allParticipants.add(attendance7);




        printStudents(allStudents, allParticipants);


    }

    public void printStudents(List<Students> allStudents, List<Participants> allParticipants){
        for(Students s : allStudents){
            if (s != null) {
                System.out.println("Student: " + s.getName());
                for (Participants p: allParticipants) {
                    if (p.getStudents() == s) {
                        System.out.println("Kurs: " + p.getCourse().getClassName());
                    }
                }
            }
        }
        System.out.println();
    }
    public static void main (String[] args){
        ClassList run = new ClassList();


    }
}
