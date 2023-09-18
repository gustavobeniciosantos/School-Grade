import java.util.ArrayList;
import java.util.HashMap;

public class Discipline {
    private String disiplineName;
    private int disiplineID;
    private double[] notes = new double[2];
    private Student students = new Student();
    private Teacher teachers = new Teacher();
    private HashMap<Discipline, Teacher> teacherHash = new HashMap<>();

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

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public HashMap<Discipline, Teacher> getTeacherHash() {
        return teacherHash;
    }

    public void setTeacherHash(HashMap<Discipline, Teacher> teacherHash) {
        this.teacherHash = teacherHash;
    }
}
