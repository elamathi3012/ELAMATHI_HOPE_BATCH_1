
class parent{
    void display(int x){
        System.out.println("Insid parent class but called by child class"+x);
    }
}
class child extends parent{
void display1(){
    System.out.println("Inside the child class ");
}
}
public class simpleInheritance {
   public static void main(String[] args) {
    System.out.println("Inside Main Function");
    child c = new child();
    c.display1();
   } 
}
