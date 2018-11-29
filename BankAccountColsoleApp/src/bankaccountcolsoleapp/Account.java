package bankaccountcolsoleapp;

public abstract class Account implements IBaseRate {

    //List Common Propertices for savings and Checking Account 
    private String name;
    private String sSN;
    private double balance;
    static int uniqueNumber = 10000;
    protected String accountNumber;
    protected double rate;

    //constructor to set base properties and initialize account 
    public Account(String name, String sSN, double balance) {
        this.name = name;
        this.sSN = sSN;
        this.balance = balance;
        //set account number
        uniqueNumber++;
        this.accountNumber = setAccountNumber();
        setBaseRate();
    }

    //Set Base Rate 
    public abstract void setBaseRate();

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Succeed "+amount+"$");
        printBalance();
    }
    public void compound(){
        double accquredInterest=balance*(rate/100);
        System.out.println("Accqured Interest: "+accquredInterest+"$");
        balance=balance+accquredInterest;
        //printBalance();
    }
    public void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Withdraw Succeed "+amount+"$");
            System.out.println("New Balance :" + balance);
        } else {
            System.out.println("You Don't Have " + amount + "$ in Your Account");
            printBalance();
        }
    }

    public void transferTo(Account that, double amount) {
        this.balance = this.balance - amount;
        that.balance = that.balance + amount;
        System.out.println("Transfer " + amount + "$ from " + this.name + " to " + that.name + ".");
        printBalance();
    }

    //List Common Method 
    private String setAccountNumber() {
        String last2ofSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return last2ofSSN + uniqueNumber + randomNumber;
    }

    public void printBalance() {
        System.out.println("Balance :" + balance);
    }

    public void showInfo() {
        System.out.println("Name: " + name
                + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance + "$"
                + "\nRate: " + rate + "%"
        );
    }
}
