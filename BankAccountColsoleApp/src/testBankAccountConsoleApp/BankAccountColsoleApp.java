package testBankAccountConsoleApp;

import bankaccountcolsoleapp.Account;
import bankaccountcolsoleapp.Checking;
import bankaccountcolsoleapp.Saving;
import java.util.LinkedList;
import java.util.List;
import utillites.CSV;

public class BankAccountColsoleApp {

    public static void main(String[] args) {
//        Checking c = new Checking("Kamrul Jaman", "123698547", 25000);
//        Saving s = new Saving("Riaz Uddin", "985632158", 35000);
//        s.compound();
//        s.showInfo();
//        System.out.println("***********************************");
//        c.compound();
//        c.showInfo();

        // Read CSV file and create new account based on this data 
        String file = "C:\\Users\\Kamrul\\Google Drive\\university\\Java Tomal SIR\\My Java Codes\\Big Project\\BankAccountColsoleApp\\NewBankAccounts.csv";
        List<Account> bankAccount = new LinkedList<Account>();
        List<String[]> newAccount = new LinkedList<>();

        newAccount = utillites.CSV.read(file);

        for (String[] account : newAccount) {

            String name = account[0];
            String sNN = account[1];
            String accountType = account[2];
            double deposit = Double.parseDouble(account[3]);

            if (accountType.equals("Savings")) {
                bankAccount.add(new Saving(name, sNN, deposit));
            } else if (accountType.equals("Checking")) {
                bankAccount.add(new Checking(name, sNN, deposit));  
            } else {
                System.err.println("ACCOUNT TYPE INVALID !! ");
            }

        }

        //Print All Account
        for (Account acc : bankAccount) {
            acc.showInfo();
            System.out.println("----------------------------------------");
        }
    }

}
