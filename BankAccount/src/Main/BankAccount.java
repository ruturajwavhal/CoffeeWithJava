package Main;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /**
         * Accepting Bank Account holder details from users
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your account information : \nEnter Account Number : ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Account Holder Name : ");
        sc.nextLine();
        String accountHolderName = sc.nextLine();
        System.out.println("Enter Balance : ");
        double balance = sc.nextDouble();
        sc.nextLine();
        Bank b = new Bank(balance, accountHolderName, accountNumber);

        /**
         * Accepting task from user which they want to perform
         */
        while(true){
            System.out.println("please choose below option : \n1. Add Balance\n2. View Balance\n3. Make withdraw \n4. Exit");
            int opt = sc.nextInt();
            if (opt < 5 && opt > 0){
                if(opt == 4){
                    System.out.println("Existing...");
                    break;
                }
                else{
                    if(opt == 1){
                        System.out.println("Enter Amount : ");
                        double amt = sc.nextDouble();
                        b.addDeposit(amt);
                        System.out.println("Amount Added");
                        sc.nextLine();
                    }
                    if(opt == 2){
                        balance = b.getBalance();
                        System.out.println("Your Current Balance is : "+balance);
                    }
                    if (opt == 3){
                        System.out.println("Enter Amount : ");
                        double amt = sc.nextDouble();
                        b.withdraw(amt);
                        System.out.println("Transaction Completed..");
                        sc.nextLine();
                    }
                }

            }
            else{
                /**
                 * user enters in valid option
                 */
                System.out.println("Please select valid option...!!!!");
            }
        }

        System.out.println("Visit again thank you !!!!");


    }
}