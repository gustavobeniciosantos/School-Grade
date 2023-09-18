import java.util.HashMap;

public class Teacher{

    private HashMap<Integer, String> teacher;
    private HashMap<Integer, String> disciplines;
    private String salary;

    public HashMap<Integer, String> getTeacher() {
        return teacher;
    }

    public void setTeacher(HashMap<Integer, String> teacher) {
        this.teacher = teacher;
    }


    public HashMap<Integer, String> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(HashMap<Integer, String> disciplines) {
        this.disciplines = disciplines;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
