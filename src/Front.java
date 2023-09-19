import java.util.Scanner;
public class Front {

    Scanner read = new Scanner(System.in);

    public int menu(){
        write("");
        write("Digite a opção desejada");
        write("");

        write("1. Adicionar ou remover um professor");
        write("2. Inserir uma ou mais disciplinas a um professor");
        write("3. Ver lista de disciplinas do professor");
        write("4. Criar uma turma");
        write("5.Remover turma");
        write("6.Acessar turma");
        write("0. Sair");


        return read.nextInt();
    }//menu


    public int teacherMenu(){

        write("Digite a opção desejada");
        write("");

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
