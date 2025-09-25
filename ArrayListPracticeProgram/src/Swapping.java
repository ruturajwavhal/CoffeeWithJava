public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a : " + a + " b : " + b);
        //swaping values using temp third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + " b : " + b);

        int p = 10;
        int q = 20;
        System.out.println("p : " + p + " q : " + q);
        //swaping values without using third variables
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("p : " + p + " q : " + q);
    }
}
