class Apartment1{
    private int x;
    public void a1(int x){
         x = this.x;
         if(x==1){
System.out.println("There is 1 bedroom without attached washroom and has 1 kitchen with 1 dinning hall with a hall and 1 comman playground for all the flats");
}
 if(x==2){
System.out.println("There is 2 bedroom with attached washroom and has 1 kitchen with 1 dinning hall with a hall and 1 comman playground for all the flats");
}
 if(x==4){
System.out.println("There is 4 bedroom with attached washroom and has 1 kitchen with 1 dinning hall with a hall common for each two bedrooma and 1 comman playground for all the flats");
}
}}
public class Apartment {
    public static void main(String[] args) {
        Apartment1 a = new Apartment1();
        a.a1(1);
        
    }
}
