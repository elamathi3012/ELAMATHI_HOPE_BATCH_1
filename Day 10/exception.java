public class exception {
    public static void main(String[] args) {
        try{
            int n = 10/0;
            System.out.println(n);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("code finished");
        }
    }
}
