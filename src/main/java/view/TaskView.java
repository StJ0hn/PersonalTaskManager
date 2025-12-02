package view;

import model.Task;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class TaskView {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu(){
        System.out.println("\n-----PERSONAL TASK MANAGER-----");
        System.out.println("\n     1. CREATE TASK" +
                           "\n     2. LIST ALL TASKS" +
                           "\n     3. LIST TASK BY ID" +
                           "\n     4. UPDATE TASK" +
                           "\n     5. UPDATE STATUS OF A EXISTENT TASK" +
                           "\n     6. DELETE TASK" +
                           "\n     0. EXIT OF PROGRAM");
        System.out.println("\n     INSERT YOUR OPTION:");
        try {
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException error){
            return -1;
        }
    }

    public Task readTaskData() {
        System.out.println("\n--- NEW TASK ---");

        System.out.print("TITLE: ");
        String title = scanner.nextLine();

        System.out.print("DESCRIPTION: ");
        String description = scanner.nextLine();

        LocalDate dueDate = readDate("DUE DATE (YYYY-MM-DD): ");

        return new Task(title, description, dueDate);
    }

    public Long readId() {
        System.out.print("TYPE ID's TASK: ");
        try {
            String input = scanner.nextLine();
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: ID MUST BE A NUMBER.");
            return null;
        }
    }

    private LocalDate readDate(String prompt) {
        while (true) {
            System.out.print(prompt);
            String dateStr = scanner.nextLine();
            try {
                return LocalDate.parse(dateStr);
            } catch (DateTimeParseException error) {
                System.out.println("INVALID DATE! USE THE FORMAT YYYY-MM-DD (ex: 2025-12-31).");
            }
        }
    }

    public void showTaskList(List<Task> tasks) {
        System.out.println("\n--- TASKS LIST ---");
        if (tasks.isEmpty()) {
            System.out.println("NO TASK REGISTERED.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void showTask(Task task) {
        System.out.println("\n--- DETAILS OF TASK ---");
        System.out.println(task);
    }

    public void showMessage(String message) {
        System.out.println("✅ " + message);
    }

    public void showError(String message) {
        System.out.println("❌ ERROR: " + message);
    }
}
