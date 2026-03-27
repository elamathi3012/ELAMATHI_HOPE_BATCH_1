class nameAndRollno{
 private String name;
 private String rollno;
 nameAndRollno(String name , String rollno){
    this.name =name;
  this.rollno =rollno ;
 }
 void display(){
    System.out.println("Name"+this.name+" rollno"+this.rollno);
 }
}
public class thiskeyword {
    public static void main(String[] args) {
         nameAndRollno r = new nameAndRollno("elamathi","24CS383");
         r.display();
    }
   
}
