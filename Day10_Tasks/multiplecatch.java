package Day10_Tasks;

public class multiplecatch {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("Specific Catch Block Executed");
        } 
        catch (Exception e) {  
            System.out.println("General Catch Block Executed");
        }
    }
}