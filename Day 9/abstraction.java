abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating");
    }
}


// CONCRETE CLASS
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        a.sound();
    }
}