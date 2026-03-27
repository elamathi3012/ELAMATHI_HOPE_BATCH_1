class vehicle{
    void display(){
        System.out.println("there are different types of vehicle ");
    }
}
class bike extends vehicle{
    void p(){
      System.out.println("the bike has two wheels ");
    }
}
class FZ extends bike{
    void gear(){
        System.out.println("this bike has five gears");
    }
}
public class multilevelinheritance {
    public static void main(String[] args) {
    FZ f = new FZ();
    f.display();
    f.p();
    f.gear();
    }
   
}
