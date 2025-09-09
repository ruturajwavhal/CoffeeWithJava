import java.util.Scanner;

public class TypeCastingINTtoDouble {
    public static void main(String[] args) {
        /**
         * Here we are accepting age from user and typecasting it into double and prints both values
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age1 = sc.nextInt();
        double age2 = (double) age1;
        System.out.println("age is store in Integer is : " + age1);
        System.out.println("After typecasting age (Integer to double) is : " + age2);
    }
}
