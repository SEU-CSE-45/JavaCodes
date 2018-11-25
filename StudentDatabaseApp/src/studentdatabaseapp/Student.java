package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private int tuitionBalance = 0;
    private static int costofCourse = 600;
    private String courses = "";
    private static int id = 1001;

    // Constructor : prompt user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sutdent Fast Name :");
        firstName = in.nextLine();
        System.out.print("Enter Sutdent Last Name :");
        lastName = in.nextLine();
        System.out.println("1.Freshman\n2.Sophore\n3.Junior\n4.Senior");
        System.out.print("Enter Sutdent Level :");
        gradeYear = in.nextInt();
        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        studentID = gradeYear + "" + id;
        id++;
    }

    //Enroll in Course
    public void enroll() {
        do {
            System.out.print("Enter Course Name to Enroll(Q to quite):");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (!input.equals("Q")) {
                courses = courses + input + ",";
                tuitionBalance = tuitionBalance + costofCourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enroll Done");
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your Tuition Balance is $" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuiton() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Payent :");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You For pay Payment $" + payment);
        viewBalance();
    }

    //Show Status
    public String toString() {
        return  "Name: " + firstName + " " + lastName
                + "\nID: " + studentID
                + "\nEnroll Course: " + courses
                + "\nTuition Fee: " + tuitionBalance;
    }
}
