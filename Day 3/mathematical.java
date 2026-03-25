
import java.util.Scanner;

public class mathematical {
    public static void main(String[] args) {
          int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for value a: ");
        a = sc.nextInt();
        System.out.print("Enter a number for value b: ");
        b = sc.nextInt();
        System.out.print("Enter a operator: ");
        String op = sc.next(); 
        switch (op) {
            case "+":
                System.out.println("Sum of a+b = " + (a+b));
                break;
            case "-":
                System.out.println("Sutraction of a-b = " + (a-b));
                break;
            case "*":
                System.out.println("Multiplication of a*b = " + (a*b));
                break;
            case "/":
                System.out.println("Division of a/b = " + (a/b));
                break;
            case "%":
                System.out.println("Modulus of a%b = " + (a%b));
                break;
        }
    }
    
}
