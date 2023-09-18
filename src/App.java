import java.util.*;
public class App {
    Scanner read = new Scanner(System.in);

    Front front = new Front();

    public App(){
    HashMap<Integer, String> disciplines = new HashMap<>();

    }


    //Gero as disciplinas
    public Discipline generateDisciplines(){

        Discipline newDiscipline = new Discipline();

        write("Digite o nome da disciplina");
        newDiscipline.setDisiplineName(read.next());
        newDiscipline.setDisiplineID((int) (Math.random() * 90000) + 10000);//ID da disciplina

        return newDiscipline;
    }//genDisc


    public void write(String text){
        System.out.println(text);
    }
}//class
