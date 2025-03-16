// Main class to test the banking system
public class BankSystem {
    public static void main(String[] args) {
        // Creating instances of different types of bank accounts
        SavingsAccount savings = new SavingsAccount("aarw3131", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("afafaf13113", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("fdsf321", 10000.0, 12);

        // Displaying account details for Savings Account
        savings.displayAccountInfo();
        savings.displayAccountType();
        System.out.println();

        // Displaying account details for Checking Account
        checking.displayAccountInfo();
        checking.displayAccountType();
        System.out.println();

        // Displaying account details for Fixed Deposit Account
        fixedDeposit.displayAccountInfo();
        fixedDeposit.displayAccountType();
    }
}

// Superclass BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " months");
    }
}

//output
// Account Number: aarw3131
//Balance: 5000.0
//Account Type: Savings Account
//Interest Rate: 3.5%
//
//Account Number: afafaf13113
//Balance: 2000.0
//Account Type: Checking Account
//Withdrawal Limit: 1000.0
//
//Account Number: fdsf321
//Balance: 10000.0
//Account Type: Fixed Deposit Account
//Tenure: 12 months