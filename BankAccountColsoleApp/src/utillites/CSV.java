/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utillites;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSV {

    //CSV FILE READ
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {
            System.out.println("FILE NOT READABLE");
        }
        return data;
    }
}
