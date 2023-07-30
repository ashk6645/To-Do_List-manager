import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> toDoList;
    private Scanner scanner;

    public Main() {
        toDoList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void printMenu() {
        System.out.println("n--- To-Do List Manager ---");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Display List");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }

    private void addItem() {
        System.out.println("Enter the item to add: ");
        String item = scanner.nextLine();
        toDoList.add(item);
        System.out.println("Item added to the list.");
    }

    private void removeItem() {
        System.out.println("Enter the index of the otem you want to remove");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < toDoList.size()) {
            String removedItem = toDoList.remove(index);
            System.out.println("Item removed: " + removedItem);

        } else {
            System.out.println("Invalid index. No item removed");
        }
    }

    private void displayList() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty");
        } else {
            System.out.println("\n--- To-Do List ---");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println(i + ". " + toDoList.get(i));
            }
            System.out.println("-------------");
        }
    }



        public static void main(String[] args)
        {
            Main app = new Main();
            app.run();
        }
    }
