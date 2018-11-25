package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //Ask how many new users we want to add
        System.out.print("Enter Number of new Student to Enroll :");
        Scanner in = new Scanner(System.in);
        int numberOfStudent = in.nextInt();
        Student[] student = new Student[numberOfStudent];

        //Create n number of students 
        for (int n = 0; n < numberOfStudent; n++) {
            student[n] = new Student();
            System.out.println("");
            student[n].enroll();
            System.out.println("");
            student[n].payTuiton();
            System.out.println("");
        }
        for (int n = 0; n < numberOfStudent; n++) {
            System.out.println("Number ["+(n+1)+"] Student Details:");
            System.out.print(student[n].toString());
            System.out.println("");

        }

    }

}
