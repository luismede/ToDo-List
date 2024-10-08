import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static final ArrayList<String> tasks = new ArrayList<>();

    static void lines() {
        System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = true;
            
            while (exit) {
                lines();
                System.out.println("\nTo-Do List in Java");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. View Task");
                System.out.println("4. Exit");
                System.out.print("\nChoose an option: ");
                int choice = scanner.nextInt();
                lines();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("\nEnter a task: ");
                        String task = scanner.nextLine();
                        tasks.add(task);
                        System.out.println("Task " + task + " added.");
                    }
                    case 2 -> {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }

                        System.out.print("\nEnter task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task " + taskNumber + " removed.");
                        } else {
                            System.out.println("Sorry! This number is invalid.");
                        }
                    }
                    case 3 -> {
                        System.out.println("\nTasks List: ");
                        if (tasks.isEmpty()) {
                            System.out.println("Empty List.");
                        }
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    }
                    case 4 -> {
                        System.out.println("Bye!");
                        exit = false;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            }
        }


    }
}
