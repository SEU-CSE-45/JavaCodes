/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kamrul
 */
public class ArraySorting {

    public static void main(String[] agrs) {
        int even = 2, odd = 1;
        Scanner in = new Scanner(System.in);
        /*
        int[] array2 = new int[input];
        // Array index input for even
        for (int row = 0; row < input; row++) {
            array1[row] = even;
            array2[row] = odd;
            even += 2;
            odd += 2;

        }
        //Print odd
        for (int row = 0; row < input; row++) {
            System.out.printf("%d, ", array2[row]);

        }System.out.println("");
        
        //Print even
        for (int row = 0; row < input; row++) {
            System.out.printf("%d, ", array1[row]);
        }
         */

        System.out.println("Array Index");
        
        int input = in.nextInt();
        //String[] array1 = new String[input];
        String[] array2={"Kamrul","Durjoy","Raad","Nice"};
        /*
        for (int row = 0; row < array2.length; row++) {
            array2[row] = in.toString();
        }
        */
        //Sorting  Arrays
        Arrays.sort(array2);

        System.out.println("Asending");

        for (String s : array2) {
            System.out.print(" "+s);
        }

        System.out.println("\nDesending");

        for (int row = array2.length - 1; row >= 0; row--) {
            System.out.print(" "+ array2[row]);
        }
    }
}
