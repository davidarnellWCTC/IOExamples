package iolab;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This package contains the work for the IOExamples Lab
 * 
 * Lab Activities:
1. Use Sample project: “IOExamples”, and reference ONLY “TextReaderApp.java”
and “TextWriterApp.java”
2. Create a text file using Notepad++ or your favorite text editor. Place the file in
“C:\temp\lab1” if using Windows O/S. If using a Macintosh, place the file in
“/Users/<yourUserName>\Documents”. The file name should end in “.txt”.
Enter data representing a small mailing list. Format exactly as follows (each
group of 3 lines is one record, create at least 3 records by typing directly into your
text editor):
FirstName LastName
Street Address
City, State Zipcode
… now read each record from the file and output to the console. Once you’ve
successfully shown that you can read data from a file, append one or two new
records using file I/O write techniques. Maintain the same format.
3. After completing #2, find the contact that is second on your list and output their
state. Do this using Java File I/O and programming only. Your output should look
like similar to this:
Bob Jones state: Wisconsin
* 
 * @author darnell
 */
public class Startup {

    public static void main(String[] args) {
        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "AddressBook.txt");

        // Creating TextFileReader and ConsolePrinter Objects
        TextFileReader tfr = new TextFileReader(data);
        MonitorOutput textoutput = new ConsolePrinter();

        // Creates a List<String> with the whole contents of the file
        List<String> textFileContents = tfr.wholeFileReader(data);

        // Creates a List<String> with just the names and states in the text file
        List<String> textFileStates = tfr.getState(data);

        // Lab Problem #1
        System.out.println("Contents of the file:");
        textoutput.printListString(textFileContents);
        System.out.println();

        // Lab Problem #2
        System.out.println("Names and states:");
        textoutput.printListString(textFileStates);
        System.out.println();

        // Lab Problem #3
        System.out.println("Second contact and their state:");
        textoutput.printListString(tfr.getSecondAddressBookContact(data));
        System.out.println();
        
        // Lab Problem #2 part 2
        
        TextFileWriter tfw = new TextFileWriter(data);
        
        try {
           data = tfw.writeContactToFile(textoutput);
        } catch (IOException ex) {
        }
        
        // Prints the revised addressBook file
        textoutput.printListString(tfr.wholeFileReader(data));

    }

}
