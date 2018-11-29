package bankaccountcolsoleapp;

public class Saving extends Account {

    // List Poertices specific to a Savings Account        
    private int safetyDepositBoxID;
    private int safetyDepositBoxPin;

    //Constructor to intialize Savings account process
    public Saving(String name, String sSN, double balance) {
        super(name, sSN, balance);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxPin = (int) (Math.random() * Math.pow(10, 4));
    }

    //List any method specific to the checking account
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Saving Account Features:"
                + "\nSafety Deporit Box ID: " + safetyDepositBoxID
                + "\nSafety Deporit Box Key: " + safetyDepositBoxPin
        );
    }

    @Override
    public void setBaseRate() {
        rate=getBaseRate() - .25;
    }
}
