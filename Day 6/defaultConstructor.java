class dconstruct{
    dconstruct(int x ){

        System.out.println("Iam inside parameterized constructor");
    }

}
public class  defaultConstructor{
    public static void main(String[] args) {
        System.out.println("see your default constructor");
        dconstruct d = new dconstruct(0);
    }
}