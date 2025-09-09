import java.util.Scanner;

public class TypeCastingDoubleToInteger {
    public static void main(String[] args) {
        /**
         * Here we are accepting decimal value from user and typecasting it into Integer and prints both values
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        double a = sc.nextDouble();
        int b = (int) a;
        System.out.println("Before typecasting Decimal value is : " + a);
        System.out.println("After typecasting (double to Integer) is : " + b);
    }
}