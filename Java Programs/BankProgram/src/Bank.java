public class Bank {
    String accHolderName;
    int accNum;
    int currentBalance;

// We assigning values to the datamember of class Using Paramaterized Constructor
    public Bank(String accHolderName, int accNum, int currentBalance)
    {
        this.accHolderName = accHolderName;
        this.accNum = accNum;
        this.currentBalance = currentBalance;
    }

// In this method we printing current account balance
    public void getAccBalance()
    {
        System.out.println("Current Balance = "+ currentBalance);
    }

// In this method we printing account holder details
    public void getAccDetails()
    {
        System.out.println("Account Holder Name : " + accHolderName + "\nAccount Number : " + accNum + "\nCurrent Balance : " + currentBalance);
    }

}
