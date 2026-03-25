class co{
    public void c (int i){
        System.out.println("Hello");
    }
    public void c(String i){
        System.out.println("HO");
    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        co e = new co();
        e.c("e");
    }
}
