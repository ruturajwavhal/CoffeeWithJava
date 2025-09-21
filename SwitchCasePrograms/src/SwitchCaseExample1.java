import java.util.Scanner;

public class SwitchCaseExample1 {
    public static void main(String[] args) {
        System.out.println("Enter your Grade in Class 10th");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().toUpperCase();

        switch (choice){
            case "A" :
                System.out.println("Remark : Excellent.!!");
                break;
            case "B" :
                System.out.println("Remark : Well Done.!!");
                break;
            case "C" :
                System.out.println("Remark : Very Good.!!");
                break;
            case "D" :
                System.out.println("Remark : Good.!!");
                break;
            case "F" :
                System.out.println("Remark : Fail.!!");
            default:
                System.out.println("Invalid Grade.!!\nTry Again");
        }
        System.out.println("Thank you.!!");
    }
}
