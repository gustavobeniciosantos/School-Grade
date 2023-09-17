import java.util.*;
public class App {
    Scanner read = new Scanner(System.in);
    HashMap<Integer, String> teachers = new HashMap<>();
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
                   teachers.put(i,read.next());
                   i++;
                   break;
               case 2:

                   break;
               case 3:
                   listTeachers();
                   break;
           }//sc
        }//while
}//genTe

    public void listTeachers(){
        for(int i = 0; i<teachers.size()+1;i++){
           String name = teachers.get(1);
           write("Nome: " + name+"     ID:"+i);
        }

      }


    public void generateDisciplines(){
        Discipline discipline = new Discipline();
        write("Seja bem vindo à Escola do Bilau!");
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
