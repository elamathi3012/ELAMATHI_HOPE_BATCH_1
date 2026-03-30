class superexample1{
   superexample1(){
    System.out.println("Called in superExample1 by super keyword");
   }
}
public class superkeyword {
   public static void main(String[] args) {
    superexample1 s = new superexample1();
   } 
}
