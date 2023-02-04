import java.util.Scanner;

public class Menu {
    public void exibirMenu() {
        Tarefas tarefa = new Tarefas();
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Escolha uma opção:");
        System.out.println("1. Criar nova Tarefa");
        System.out.println("2. Editar Tarefa");
        System.out.println("3. Buscar Tarefa");
        System.out.println("4. Deletar Tarefa");
        System.out.println("5. Exibir lista de Tarefas");
        System.out.print("Sua escolha: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                tarefa.CriarTarefa();

                break;
            case 2:
                tarefa.editarTarefa();
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
}


