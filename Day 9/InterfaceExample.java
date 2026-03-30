interface a{
    void show();
}

interface b{
    void display();
}
class C implements a,b{
    public void show(){
        System.out.println("From interface a");
    }
    public void display(){
        System.out.println("From interface b");
    }
}
public class InterfaceExample{
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.display();
    }
}