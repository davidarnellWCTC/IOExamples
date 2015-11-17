/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *The TextFileWrite class is responsible for writing text to the file
 * @author darnell
 */
public class TextFileWriter {
    
    Scanner scanner = new Scanner(System.in);

    private Output o;
    
    private boolean append = false;
    
    private File data;
    
    /**
     * Empty constructor for the TextFileWriter class
     */
    public TextFileWriter() {
    }

    /**
     * TextFileWrite(File data) constructor instantiates the class with the
     * text file for the addressBook
     * @param data - File data - the text file for the addressBook
     */
    public TextFileWriter(File data) {
        this.data = data;
    }
    
    /**
     * This method uses a user defined Output to retrieve data to store
     * in the addressBook file
     * The address is saved and stored to the file
     * @param o - Output method used to retrieve the new address info
     * @return 
     */
    public File writeContactToFile(Output o) throws IOException{
        this.o = o;
        
        String fName = "";
        String lName = "";
        String streetAddress = "";
        String city = "";
        String state = "";
        String zip = "";
        
        String[] record = new String[3];
        
        
        o.printString("Enter your first name: ");
        fName = scanner.nextLine();
        
        o.printString("Enter your last name: ");
        lName = scanner.nextLine();
        
        o.printString("Enter your street address: ");
        streetAddress = scanner.nextLine();
        
        o.printString("Enter your city: ");
        city = scanner.nextLine();
        
        o.printString("Enter your two letter state code: ");
        state = scanner.nextLine();
        
        o.printString("Enter your five digit zip: ");
        zip = scanner.nextLine();
        
        record[0] = fName + " " + lName;
        record[1] = streetAddress;
        record[2] = city + ", " + state + " " + zip;
        
        // I just wanted to see if this would work
        // It worked
        data = writeStringArrayToFile(data, record);
        
        return data;
    }
    
    /**
     * This method takes a String[] and adds each line to a text file
     * The lines are added to the end of the file.
     * @param data - File data object the array will be added to
     * @param string - the String[] that will be added to the File data
     * @return - returns the revised File data
     * @throws IOException 
     */
    public File writeStringArrayToFile(File data, String[] string) throws IOException{
        boolean append = true;
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        
        // The loop runs through the String[] and adds them to the File data object.       
        for (String s: string){
            out.println(s);
            //System.out.println(s);
        }      
        
        out.close();        
        
        //System.out.println("Wrote file to: " + data.getAbsolutePath());
        
        return data;
    }
    
    
}
