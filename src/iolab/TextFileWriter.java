/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.File;
import java.util.*;

/**
 *
 * @author darnell
 */
public class TextFileWriter {
    
    Scanner scanner = new Scanner(System.in);

    Output o;
    
    boolean append = false;
    
    File data;
    
    public TextFileWriter() {
    }

    public TextFileWriter(File data) {
        this.data = data;
    }
    
    
    public File writeContactToFile(File data, Output o){
        this.o = o;
        
        String fName = "";
        String lName = "";
        String streetAddress = "";
        String city = "";
        String state = "";
        String zip = "";
        
        String[] record = new String[2];
        
        
        o.printString("Enter your first name: ");
        fName = scanner.nextLine();
        
        o.printString("Enter your last name: ");
        lName = scanner.nextLine();
        
        o.printString("Enter your street address: ");
        streetAddress = scanner.nextLine();
        
        o.printString("Enter your last city: ");
        city = scanner.nextLine();
        
        o.printString("Enter your last state: ");
        state = scanner.nextLine();
        
        o.printString("Enter your last zip: ");
        zip = scanner.nextLine();
        
        record[0] = fName + " " + lName;
        record[1] = streetAddress;
        record[2] = city + ", " + state + " " + zip;
        
        data = writeStringArrayToFile(data, record);
        
        return data;
    }
    
    public File writeStringArrayToFile(File data, String[] string){
        
        
        return data;
    }
    
    
}
