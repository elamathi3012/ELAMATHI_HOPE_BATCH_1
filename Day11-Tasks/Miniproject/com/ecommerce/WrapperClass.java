public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer objA=Integer.valueOf(a);
        System.out.println(objA);
        System.out.println(a==objA);
        System.out.println(objA.hashCode());
        Character c='a';
        System.out.println(c);
        System.out.println(c.hashCode());
    }
}