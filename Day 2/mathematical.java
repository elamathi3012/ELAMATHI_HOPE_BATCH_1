import java.util.Scanner;

public class mathematical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String e = s.nextLine();
        switch(e){
            case "sum": 
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a+b);
                break;
            case "difference":
                int c = s.nextInt();
                int d = s.nextInt();
                System.out.println(c-d);
                break;
            case "product":
                int f = s.nextInt();
                int g = s.nextInt();
                System.out.println(f*g);
                break;
            case "quotient":

                int h = s.nextInt();
                int i = s.nextInt();
                System.out.println(h/i);
                break;
        }
    }
}
