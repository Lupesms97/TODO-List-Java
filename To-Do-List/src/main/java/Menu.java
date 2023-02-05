import java.util.Scanner;

public class Menu {
    Tarefas tarefa = new Tarefas();
    Scanner input = new Scanner(System.in);
    public void exibirMenu() {


        int choice;

        System.out.println("Escolha uma opção:");
        System.out.println("1. Criar nova Tarefa");
        System.out.println("2. Editar Tarefa");
        System.out.println("3. Buscar Tarefa pelo nome");
        System.out.println("4. Deletar Tarefa");
        System.out.println("5. Exibir lista de Tarefas");
        System.out.print("Sua escolha: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                tarefa.CriarTarefa();
                break;
            case 2:
                tarefa.EditarTarefa(tarefa);
                break;
            case 3:
                tarefa.BuscaTarefa(tarefa.getNome());
                break;
            case 4:
                tarefa.ExcluirTarefa(tarefa);
                break;
            case 5:
                tarefa.MostrarListaDeTarefas();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}


