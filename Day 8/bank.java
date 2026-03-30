class banka{
    private double balance;
     banka(double balance){
        this.balance = balance;
    }public void display(){
        System.out.println(balance);
    }

}

public class bank {
    public static void main(String[] args) {
        banka a = new banka(1000);
        a.display();
      
    }
}
