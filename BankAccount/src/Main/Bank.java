package Main;

public class Bank {

    private double balance;
    private String accountHolderName;
    private int accountNumber;

    /**
     * Declaring private data members and assigning values by using parameterized constructor
     * @param balance
     * @param accountHolderName
     * @param accountNumber
     */

    public Bank(double balance, String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    /**
     * Adding deposit amount to the acount
     * @param depositAmount
     */
    public void addDeposit(double depositAmount) {
        balance += depositAmount;
    }

    /**
     * Performing withdrawal operation to make withdrawal
     * @param withdrawalAmount
     */
    public void withdraw(double withdrawalAmount){
        balance -= withdrawalAmount;
    }

    /**
     * this method returns current balance
     * @return balance
     */
    public double getBalance(){
        return balance;
    }
}
