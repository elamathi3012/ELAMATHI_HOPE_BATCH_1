class animal{
    void display(){
        System.out.println("there are multiple animals chose 1");
    }
}
class dog{
    void sound(){
        System.out.println("barks");
    }
}

public class inheritance {
    public static void main(String[] args) {
        dog s = new dog();
        s.sound();
    }
}
