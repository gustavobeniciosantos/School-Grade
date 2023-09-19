import java.util.*;
public class App {
    Scanner read = new Scanner(System.in);
    HashMap<Integer, Teacher> teacherHash = new HashMap<>();
    HashMap<Integer, Discipline> disciplinesHash = new HashMap<>();
    ArrayList<Discipline> disciplines = new ArrayList<>();
    HashMap<Discipline, Teacher> hashDisciplineTeacher;
    boolean repClass = true;
    Discipline disciplineSelected;

    Front front = new Front();

    public App(){
        write("Seja bem-vindo(a) a nossa escola!");
        generateDiscipline();
        generateTeacher();

        while(repClass){
            int option = front.menu();

            switch (option){
                case 1:
                    generateTeacher();
                    break;
                case 2:
                    assignDisciplineToTeacher();
                    break;
                case 3:
                    showListTeacherOfDiscipline();
                    break;
                case 0:
                    repClass = false;
                    break;
            }//sc
        }//while

    }//constructor


    public void showListTeacherOfDiscipline(){
        write("Digite o código do professor que deseja ver as matérias atribuidas");
        listTeacher();
        int idTeacher = read.nextInt();

        Teacher teacherSelected = teacherHash.get(idTeacher);
        write("-----------Professor " + teacherSelected.getName()+"-----------");
        write("");
        if(teacherSelected.getDisciplines().size() == 0){
            write("Não há nenhuma matéria atribuida");
            write("----------------------------------");
        }else{
            for(int i = 0; i < teacherSelected.getDisciplines().size(); i++){
                System.out.println(teacherSelected.getDisciplines().get(i).getDisiplineName());
            }//for
        }//else


    }

    public void assignDisciplineToTeacher(){
        write("Digite o Id do professor que deseja atribuir");
        listTeacher();
        int idTeacher = read.nextInt();

        Teacher teacherSelected = teacherHash.get(idTeacher);

        write("Professor " + teacherSelected.getName() + " selecionado");
        write("");
        write("Quantas matérias você deseja adicionar a este professor? Máx:" + disciplinesHash.size());
        int qtdDisciplines = read.nextInt();

        while (qtdDisciplines > disciplinesHash.size()){
           write("Tamanho errado, digite novamente");
           qtdDisciplines = read.nextInt();
        }//whileVeriff
        write("Digite o(s) id(s) da(s) matéria(s)");
        listDisciplines();

        for(int i = 0; i < qtdDisciplines; i++){

            int idDiscipline = read.nextInt();

            disciplineSelected = disciplinesHash.get(idDiscipline);//pega a disciplina selecionada com o ID (Return OBJ Discipline)

            disciplines.add(disciplineSelected);//Coloco o objeto disciplina dentro do arraylist
            teacherSelected.setDisciplines(disciplines);
        }//forAddDiscipline


    }//createClass









//----------------------------------------//

    //Gerar ou Remover um professor
    public void generateTeacher(){

        boolean repTeacher = true;

        while (repTeacher){
            int option = front.teacherMenu();
            switch (option){
                case 1:
                    Teacher newTeacher = createTeacher();
                    teacherHash.put(newTeacher.getId(), newTeacher);
                    break;
                case 2:
                    listTeacher();
                    write("Digite o id do professor que deseja remover");
                    int id = read.nextInt();
                    teacherHash.remove(id);
                    break;
                case 3:
                    listTeacher();
                    break;
                case 0:
                    repTeacher = false;
                    break;
                default:
                    write("Opção errada");
            }//sc
        }//whileTeacher

    }//genTeacher
//----------------------------------------//

    //Lista os Professores
    public void listTeacher(){
        System.out.println("Lista de Professores:");

        for (Map.Entry<Integer, Teacher> entry : teacherHash.entrySet()) {
            int id = entry.getKey();
            Teacher teacher = entry.getValue();
            String name = teacher.getName();

            System.out.println("Nome: " + name + "    ID: " + id);
        }

    }//listTeacher

//----------------------------------------//

    //Imputo os dados do professor e retorno um objeto professor

    public Teacher createTeacher(){

        Teacher newTeacher = new Teacher();

        write("Digite o nome do professor");
        newTeacher.setName(read.next());

        newTeacher.setId((int) (Math.random() * 9000) + 1000); //Gera o ID

        return newTeacher;
    }//criarProfessor

    //----------------------------------------//

    //Listar Disciplinas
    public void listDisciplines(){

        for(Map.Entry<Integer, Discipline> entry : disciplinesHash.entrySet()){
            int id = entry.getKey();
            String name = entry.getValue().getDisiplineName();

            System.out.println("Disciplina: " + name + "   ID: " + id);
        }//forPrint
    }


    //-------------------------------------//

    //Adiciono o Objeto num Hashmap
    public void generateDiscipline(){
        write("Quantas disciplinas você quer na sua escola?");
        int qtdDisciplines = read.nextInt();

        for(int i = 0; i < qtdDisciplines; i++){

            Discipline newDiscipline = createDiscipline();

            disciplinesHash.put(newDiscipline.getDisiplineID(), newDiscipline);
        }//forLoad

    }//generate Discipline

    //----------------------------------------//

    //Imputo os dados da disciplina e retorno um objeto
    public Discipline createDiscipline(){

        Discipline newDiscipline = new Discipline();

        write("Digite o nome da disciplina");
        newDiscipline.setDisiplineName(read.next());//Nome disciplina
        newDiscipline.setDisiplineID((int) (Math.random() * 90000) + 10000);//ID da disciplina

        return newDiscipline;
    }//Criar Disciplina


    public void write(String text){
        System.out.println(text);
    }
}//class
