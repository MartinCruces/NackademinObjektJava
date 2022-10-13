package Sprint1.Sprint1Uppgift3;

public class Class {
    protected String className;
    protected Teachers teacher;
    public Class(String className){
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    public Teachers getTeacher(){
        return teacher;
    }
    public void addTeacher(Teachers teacher){
        this.teacher = teacher;

    }
    public void deleteTeacher(){
        this.teacher = null;
    }
}