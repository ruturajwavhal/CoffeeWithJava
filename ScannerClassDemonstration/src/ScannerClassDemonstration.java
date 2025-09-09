import java.util.Scanner;

public class ScannerClassDemonstration {
    public static void main(String[] args) {

        /**
         * Taking input from user and performing some arithmetic operations and
         * relational operations and printing result accordingly.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number : ");
        int b = sc.nextInt();
        System.out.println("Values of a = " + a + "and b = " + b);

        /**
         *  Here we are performing arithmetic operations and printing result accordingly
         */
        System.out.println("Choose following option to perform Arithmetic opertion : \n1 : Addition\n2 : Substraction\n3 : Multiplication\n4 : Division\n5 : Modulus");
        int opt = sc.nextInt();

        if(opt == 1){
            System.out.println("Addition is : " + (a + b));
        }
        else if(opt == 2){
            System.out.println("Substraction is : " + (a - b));
        }
        else if(opt == 3){
            System.out.println("Multiplication is : " + (a * b));
        }
        else if(opt == 4){
            System.out.println("Division is : " + (a / b));
        }
        else if(opt == 5){
            System.out.println("Modulus is : " + (a % b));
        }
        else{
            System.out.println("Please enter valid option, try again!!!");
        }

        /**
         * Here we are illustrating relational operator
         */

        if(a > b){
            System.out.println("a is greater than b");
        }

        if(a < b){
            System.out.println("a is smaller than b");
        }

        if(a <= b){
            System.out.println("a is less than or equal to b");
        }

        if(a >= b){
            System.out.println("a is greater than or equal to b");
        }

        if(a == b){
            System.out.println("a is equal to b");
        }

        if(a != b){
            System.out.println("a is not equal to b");
        }

    }
}
