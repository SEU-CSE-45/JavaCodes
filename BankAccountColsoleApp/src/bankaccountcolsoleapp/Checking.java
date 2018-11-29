package bankaccountcolsoleapp;

public class Checking extends Account {
    // List Poertices specific to a checking Account        

    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to intialize checking account process
    public Checking(String name, String sSN, double balance) {
        super(name, sSN, balance);
        accountNumber = "2" + accountNumber;
        setDebitCardInfo();

    }

    private void setDebitCardInfo() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    //List any method specific to the checking account

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features:"
                + "\nDebit Card Number: " + debitCardNumber
                + "\nDebit Card Pin: " + debitCardPin
        );
    }

    @Override
    public void setBaseRate() {
        rate=getBaseRate()*.15;
    }
}
