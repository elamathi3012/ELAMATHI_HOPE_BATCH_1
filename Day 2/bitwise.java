import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner s   = new Scanner(System.in);
        int a = s.nextInt(); 
        int b = s.nextInt();
        int and = a & b; 
        System.out.println("Bitwise AND: " + and);
        int or= a | b; 
        System.out.println("Bitwise OR: " + or);
        int xor = a ^ b; 
        System.out.println("Bitwise XOR: " + xor);
        int not= ~a; 
        System.out.println("Bitwise NOT: " + not);
    }
}
