import java.util.Scanner;
public class Front {

    Scanner read = new Scanner(System.in);

    public int menu(){

        


        return read.nextInt();
    }//menu


    public int teacherMenu(){

        write("1. Adicionar professor");
        write("2. Remover professor (Digite o id dele)");
        write("3. Listar professores");
        write("0. Finalizar");

        return read.nextInt();
    }

    public void write(String text){
        System.out.println(text);
    }

}
