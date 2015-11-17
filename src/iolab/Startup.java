package iolab;

import java.io.File;
import java.util.*;

/**
 *
 * @author darnell
 */
public class Startup {

    public static void main(String[] args) {
        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "AddressBook.txt");

        // Creating TextFileReader and ConsolePrinter Objects
        TextFileReader textFile = new TextFileReader(data);
        Output print = new ConsolePrinter();

        // Creates a List<String> with the whole contents of the file
        List<String> textFileContents = textFile.wholeFileReader(data);

        // Creates a List<String> with just the names and states in the text file
        List<String> textFileStates = textFile.getState(data);

        // Lab Problem #1
        System.out.println("Contents of the file:");
        print.printListString(textFileContents);
        System.out.println();

        // Lab Problem #2
        System.out.println("Names and states:");
        print.printListString(textFileStates);
        System.out.println();

        // Lab Problem #3
        System.out.println("Second contact and their state:");
        print.printListString(textFile.getSecondAddressBookContact(data));
        System.out.println();
        
        // Lab Problem #4
        

    }

}
