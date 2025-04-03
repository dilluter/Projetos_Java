import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + title + ": " + description;
    }
}

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== GERENCIADOR DE TAREFAS ====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar como Concluída");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    System.out.println("Saindo... Obrigado por usar o Gerenciador de Tarefas!");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Digite o título da tarefa: ");
        String title = scanner.nextLine();
        System.out.print("Digite a descrição da tarefa: ");
        String description = scanner.nextLine();

        tasks.add(new Task(title, description));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("\n=== LISTA DE TAREFAS ===");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void markTaskAsCompleted() {
        listTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Digite o número da tarefa concluída: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).markAsCompleted();
                System.out.println("Tarefa marcada como concluída!");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    private static void removeTask() {
        listTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Digite o número da tarefa a remover: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }
}
