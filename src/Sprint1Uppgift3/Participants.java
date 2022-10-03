package Sprint1Uppgift3;

public class Participants {


    protected Class course;
    protected Students students;
    public Participants(Class course, Students students){
        this.course = course;
        this.students = students;
    }
    public Students getStudents(){
        return students;
    }
    public Class getCourse(){
        return course;
    }
    public void setCourse(Class course) {
        this.course = course;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
