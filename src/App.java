import java.util.*;
public class App {
    Scanner read = new Scanner(System.in);
    Teacher teacher = new Teacher();
    Front front = new Front();
    HashMap<Integer, String> professor = new HashMap<>();
    boolean repClass = true;
    boolean repTeacher = true;
    public App(){

    generateDisciplines();
        write("Dicipinas cadastradas ");
        write("");

    generateTeacher();

    write("");
    generateClass();



}//constr




    public void addDisciplineToTeacher(){
        write("Selecione um professor para atribuir uma ou mais matérias");
        write("");
        listTeachers();


        int selectedTeacher = read.nextInt();
    }



    public void generateClass(){

        while (repClass){
            write("");
            int option = front.menu();
            write("");
            switch (option){
                case 1://add ou rem prof
                    repTeacher = true;
                    generateTeacher();
                    break;
                case 2://add disciplina a um prof
                    addDisciplineToTeacher();
                    break;
                case 3://add turma
                    break;
                case 4://rem turma
                    break;
                case 5://acessar turma
                    break;
                case 0:
                    repClass = false;
                    break;
            }

        }
    }//genClass


// Gero um ou mais professores
    public void generateTeacher(){


        int i = 1;


        while(repTeacher){
            int option = front.teacherMenu();

           switch (option){
               case 1:
                   write("Digite o nome");
                   professor.put((int)(Math.random()*9000)+1000,read.next());
                   teacher.setTeacher(professor);
                   break;

               case 2:
                   listTeachers();
                   write("Digite o ID do professor que deseja remover: ");
                   int key = read.nextInt();
                    professor.remove(key);
                   break;
               case 3:
                   listTeachers();
                   break;
               case 0:
                   return;
           }//sc

        }//while


}//genTeacher


    //Listo os professores
    public void listTeachers(){

        for(Map.Entry<Integer, String> entry : professor.entrySet()){
            int id = entry.getKey();
            String name = entry.getValue();

            write("Nome: " + name + "    ID: "+ id);
        }//for

      }

    //Gero as disciplinas
    public void generateDisciplines(){
        Discipline discipline = new Discipline();
        write("Seja bem vindo à Escola da Brendinha!");
        write("Quantas matérias você possui na sua escola?");
        int num = read.nextInt();

        HashMap<Integer, String> disc = new HashMap<>();

        for(int i = 0; i < num; i++){

            write("Digite o nome da discipilina: ");
            disc.put((i+1),read.next());
        }
        discipline.setDisipline(disc);

       for(int i = 1; i < disc.size()+1; i++){
           System.out.println(disc.get(i));
       }
    }//genDisc


    public void write(String text){
        System.out.println(text);
    }
}//class
