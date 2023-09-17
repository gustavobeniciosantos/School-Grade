import java.util.HashMap;

public class Teacher{

    private HashMap<Integer, String> teacher;
    private Discipline disciplines;
    private String salary;

    public HashMap<Integer, String> getTeacher() {
        return teacher;
    }

    public void setTeacher(HashMap<Integer, String> teacher) {
        this.teacher = teacher;
    }


    public Discipline getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Discipline disciplines) {
        this.disciplines = disciplines;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
