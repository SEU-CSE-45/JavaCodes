package emailapp;

import java.util.Scanner;

public class Email {

    String fastName;
    String lastName;
    String department;
    String password;
    String email;
    int passwordLength = 8;
    String alternateMail;
    int mailBoxCapacity=500;

    // Constructor
    public Email(String fastName, String lastName) {
        this.fastName = fastName;
        this.lastName = lastName;


        //Set Department
        this.department = setDepartment();

        //Set Random Password
        this.password = setRandomPassword(passwordLength);

        //Genarate Email Format
        email = fastName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "srb.com";

    }

    //Ask For Depertment
    private String setDepartment() {
        System.out.println("Seclet Deparment Code\n1. for Sales\n2. for Devlopment\n3. for Accounting\n0. for none ");
        Scanner input = new Scanner(System.in);
        int chose = input.nextInt();
        if (chose == 1) {
            return "sales";
        } else if (chose == 2) {
            return "dev";
        } else if (chose == 3) {
            return "acc";
        } else if (chose == 0) {
            return "";
        } else {
            return "";
        }
    }

    //Generate Random Passowrd
    private String setRandomPassword(int length) {
        String passwordSet = "QWERTYUIOPLKJHGFDSAZXCVBNMmnbvcxzasdfghjklpoiuytrewq1234567890@#$&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Chanage Passwrod
    public void changePasswor(String password) {
        this.password = password;
    }
    
    //Set Mailbox Capacity
    public void mailBoxCapacity(int capacity){
    this.mailBoxCapacity=capacity;
    }
    
    //Set the AlternateMail
    public void alternateMail(String mail){
    this.alternateMail=mail;
    }
    
    //All Get Method
    public int getMailBoxCapacity(){
    return this.mailBoxCapacity;
    }
    public String getAlternateMail(){
    return this.alternateMail;
    }
    public String  getPassword(){
    return this.password;
    }
    
   public String showInfo(){
   return "Name: "+this.fastName+" "+this.lastName+
           "\nEmail: "+email+
           "\nPassword: "+password+
           "\nMail Capacity"+this.mailBoxCapacity+" mb";
   }
}
