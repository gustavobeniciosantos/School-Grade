import java.util.HashMap;

public class Classroom {
    private String Classroom;
    private HashMap<Integer, Student> student;
    private Teacher teacher;


    

    public HashMap<Integer,Student> getStudent() {
        return this.student;
    }

    public void setStudent(HashMap<Integer, Student> student) {
        this.student = student;
    }

    

    public String getClassroom() {
        return this.Classroom;
    }

    public void setClassroom(String Classroom) {
        this.Classroom = Classroom;
    }

    

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



}