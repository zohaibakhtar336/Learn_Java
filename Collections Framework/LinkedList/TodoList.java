import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        
        LinkedList<String> todoList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Completed Task");
            System.out.println("3. View To-Do List");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1: // Add task
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    todoList.addLast(task);
                    System.out.println("Task added: " + task);
                    break;
                    
                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter task to remove: ");
                        String taskToRemove = sc.nextLine();
                        if (todoList.remove(taskToRemove)) {
                            System.out.println("Task removed: " + taskToRemove);
                        } else {
                            System.out.println("Task not found in the list.");
                        }
                    }
                    break;
                    
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("To-Do List: ");
                        for (String t : todoList) {
                            System.out.println("- " + t);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
