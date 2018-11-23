package Matrix;

import java.util.Scanner;

public class DiaUpperLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] MatrixA = new int[3][3];
        int[][] MatrixB = new int[3][3];
        int[][] MatrixC = new int[3][3];

        // Input Matrix A
        System.out.println("Input Matrix A");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                MatrixA[row][col] = input.nextInt();
            }
        }
        //Print Matrix A
        System.out.println("");
        System.out.println("Matrix A");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("%d  ", MatrixA[row][col]);
            }
            System.out.println("");
        }

        //Sum Of Dia,Upper,Lower
        int dia = 0, upper = 0, lower = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    dia = dia + MatrixA[row][col];
                }
                if (row < col) {
                    upper = upper + MatrixA[row][col];
                }
                if (row > col) {
                    lower = lower + MatrixA[row][col];
                }
            }
        }
        //Print Dia,Upper,Lower
        System.out.print("Dia: "+dia
        +"\n Upper: "+upper+"\n Lower: "+lower
        );    
                
    }

}
