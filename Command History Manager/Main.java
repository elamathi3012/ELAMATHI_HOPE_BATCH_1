import java.util.*;

class CommandHistoryManager {
    private ArrayList<String> history;

    public CommandHistoryManager() {
        history = new ArrayList<>();
    }

   
    public void addCommand(String command) {
        history.add(command);
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No commands in history.");
            return;
        }
        for (int i = 0; i < history.size(); i++) {
            System.out.println(i + ": " + history.get(i));
        }
    }
    public void searchCommand(String keyword) {
        boolean found = false;
        for (String cmd : history) {
            if (cmd.contains(keyword)) {
                System.out.println(cmd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching command found.");
        }
    }
    public void sortCommands() {
        Collections.sort(history);
        System.out.println("Commands sorted successfully.");
    }
    public void runCommand(int index) {
        try {
            System.out.println("Running: " + history.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommandHistoryManager manager = new CommandHistoryManager();

        while (true) {
            System.out.println("\n1. Add Command");
            System.out.println("2. Show History");
            System.out.println("3. Search Command");
            System.out.println("4. Sort Commands");
            System.out.println("5. Run Command");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter command: ");
                        String cmd = sc.nextLine();
                        manager.addCommand(cmd);
                        break;

                    case 2:
                        manager.showHistory();
                        break;

                    case 3:
                        System.out.print("Enter keyword: ");
                        String key = sc.nextLine();
                        manager.searchCommand(key);
                        break;

                    case 4:
                        manager.sortCommands();
                        break;

                    case 5:
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();
                        manager.runCommand(index);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter valid input!");
                sc.nextLine(); // clear buffer
            }
        }
    }
}