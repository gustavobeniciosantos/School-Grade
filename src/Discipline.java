import java.util.ArrayList;
import java.util.HashMap;

public class Discipline {
    private String disiplineName;
    private int disiplineID;
    private double[] notes = new double[2];
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public String getDisiplineName() {
        return disiplineName;
    }

    public void setDisiplineName(String disiplineName) {
        this.disiplineName = disiplineName;
    }

    public int getDisiplineID() {
        return disiplineID;
    }

    public void setDisiplineID(int disiplineID) {
        this.disiplineID = disiplineID;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
