package Holiday_Tasks;

import java.util.Scanner;

public class subwaysufers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String c = s.nextInt();

        switch (c) {
            case "left":
                System.out.println("Turning left !");
                break;
            case "right":
                System.out.println("Turning right !");
                break;
            case "jump":
                System.out.println("Jumping !");
                break;
            case "slid":
                System.out.println("Sliding");
                break;
            default:
                System.out.println("obstacle hit! Game Over.");
        }

    }
}
