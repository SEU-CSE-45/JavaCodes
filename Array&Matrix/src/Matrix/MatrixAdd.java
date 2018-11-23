/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import java.util.Scanner;

public class MatrixAdd {

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
        // Input Matrix B
        System.out.println("Input Matrix B");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                MatrixB[row][col] = input.nextInt();
            }
        }
        //Print Matrix B
        System.out.println("");
        System.out.println("Matrix B");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("%d  ", MatrixB[row][col]);
            }
            System.out.println("");
        }

        //The Sum OF Matrix A+B 
        System.out.println("Matrix A+B");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("%d  ", MatrixB[row][col]-MatrixA[row][col]);
            }
            System.out.println("");
        }

    }

}
