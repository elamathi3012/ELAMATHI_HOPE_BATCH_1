
class animal{
    void sound(){
        System.out.println("all animals have different sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
}
public class poly {
    public static void main(String[] args) {
        animal a;
          a = new cat();
          a.sound();
        
    }
}
