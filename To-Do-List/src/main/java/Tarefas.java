import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
    Scanner input = new Scanner(System.in);
    private String nome;
    private String descricao;
    private LocalDate dataTermino;
    private int prioridade;
    private String categoria;
    private Status status;
    List<Tarefas> listaTarefas = new ArrayList<>();

    public Tarefas(String nome, String descricao, LocalDate dataTermino, int prioridade, String categoria, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    public Tarefas(String nome, int prioridade, String categoria) {

        this.nome = nome;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    public Tarefas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTermino=" + dataTermino +
                ", prioridade=" + prioridade +
                ", categoria='" + categoria + '\'' +
                ", status=" + status +
                '}';
    }

    void CriarTarefa() {
        Tarefas tarefa = new Tarefas();
        System.out.println("Qual o nome da tarefa:");
        String nome = input.next();
        tarefa.setNome(nome);
        System.out.println("-----------");
        System.out.println("Qual a descrição da tarefa:");
        String descricao = input.next();
        tarefa.setDescricao(descricao);
        System.out.println("-----------");
        System.out.println("Qual o prazo da tarefa:");
        String prazo = input.next();
        tarefa.setDataTermino(ConversorStringData(prazo));
        System.out.println("-----------");
        System.out.println("Qual a prioridade da tarefa(1-5) :");
        int prioridade = input.nextInt();
        tarefa.setPrioridade(prioridade);
        System.out.println("-----------");
        System.out.println("Por padrão todas as tarefas são definidas com a fazer");
        listaTarefas.add(tarefa);
    }

    LocalDate ConversorStringData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(data, formatter);
        return localDate;
    }

    void editarTarefa() {
        Tarefas tarefa = BuscaTarefa();
        System.out.println("Escolha uma opção:");
        System.out.println("1. Nome");
        System.out.println("2. Descrição");
        System.out.println("3. Data de termino");
        System.out.println("4. Prioridade");
        System.out.println("5. Status");
        System.out.print("Sua escolha: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Qual o nome da tarefa:");
                String nome = input.next();
                tarefa.setNome(nome);
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                break;
            case 4:
                System.out.println("Você escolheu a opção 4");
                break;
            case 5:
                System.out.println("Você escolheu a opção 5");
                break;
            default:
                System.out.println("Opção inválida");


        }

    }
    Tarefas BuscaTarefa (Tarefas tarefa) {

        if(listaTarefas.contains(tarefa))
        return tarefa;
    }
}


