import java.util.*;
public class App {
    Scanner read = new Scanner(System.in);
    Teacher teacher = new Teacher();
    HashMap<Integer, String> professor = new HashMap<>();
    public App(){

    generateDisciplines();
    write("Ótimo, agora cadastre os professores: ");

    generateTeacher();

}//constr

    public void generateTeacher(){
         boolean rep = true;

        Front front = new Front();
        while(rep){
            int i = 1;
           int option = front.teacherMenu();

           switch (option){
               case 1:
                   write("Digite o nome");
                   professor.put(i++,read.next());

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
           }//sc

        }//while
        teacher.setTeacher(professor);

}//genTe

    public void listTeachers(){



      }


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
