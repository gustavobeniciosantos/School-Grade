import java.util.ArrayList;
import java.util.HashMap;

public class Discipline {
    private HashMap<Integer, String> disipline;
    private double[] notes = new double[2];
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public HashMap<Integer, String> getDisipline() {
        return disipline;
    }

    public void setDisipline(HashMap<Integer, String> disipline) {
        this.disipline = disipline;
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
