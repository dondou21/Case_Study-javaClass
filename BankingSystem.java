import java.util.Scanner;

class BankAccount
{
    //Instance Variables declarartion

    private long accountNum;
    private String accountName;
    private double balance;
    private float interest;

    //Defining parameterizied constructor 

    BankAccount(long accountNum, String accountName, double balance, float interest)
    {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
        this.interest = interest;
    }

    // Defining the methods

    void deposit(double amount)
    {
        this.balance += amount;
    }

    double withdraw(double amount)
    {
        // Check if you have enough balance
        if(this.balance >= amount)
        {
            this.balance -= amount;      
        } else
        {
            System.out.println(" Sorry! You have Insufficient Balance");
        }

            return this.balance;
    }

    void interest(float interest)
    {
        this.balance += this.balance * interest;
    }

    double balance(long accountNum)
    {
        return this.balance;
    }

}



public class BankingSystem {
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in); // Declare scanner

        // THis is our console application (NOT GUI)
        System.out.println("Welcome to the BK Banking System");

        // Collecting all he customer data
        System.out.println("Enter The Name:");
        String accountName = scanner.nextLine();
        long accountNum = 40015001;

        System.out.println("Enter the amount");
        double amount = scanner.nextDouble();
        float interestRate = 0.2F;

        // Create an object of the BankAccount
        BankAccount bankAccount = new BankAccount(accountNum, accountName, amount, interestRate);

        System.out.println("Check the balance");
        double balance = bankAccount.balance(accountNum);
        System.out.println(balance);





    }
}