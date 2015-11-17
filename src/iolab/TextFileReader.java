/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author darnell
 */
public class TextFileReader {

    File data;

    public TextFileReader() {
    }

    public TextFileReader(File data) {
        this.data = data;
    }

    /**
     * This method reads a file and saves each line to a String List
     */
    public List<String> wholeFileReader(File data) {

        this.data = data;

        List<String> fileContents = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                //System.out.println(line);
                //line = in.readLine();  // strips out any carriage return chars
                fileContents.add(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }

        fileContents.add("");

        return fileContents;
    }

    public List<String> getState(File data) {

        this.data = data;

        List<String> fileContents = new ArrayList<>();
        List<String> fileStates = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                //System.out.println(line);
                //line = in.readLine();  // strips out any carriage return chars
                fileContents.add(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }

        String name = "";
        String state = "";
        int i = 1;
        for (String s : fileContents) {
            if (i == 1) {
                name = s;
            } else if (i == 3) {
                state = s.substring(s.indexOf(" ") + 1 , s.indexOf(" ") +3);
                fileStates.add(name + " state: " + state);
            }

            if (i == 3) {
                i = 1;
            } else {
                i++;
            }
        }

        fileStates.add("");

        return fileStates;
    }

    public List<String> getSecondAddressBookContact(File data) {

        this.data = data;

        String name = "";
        String state = "";
        int i = 1;
        List<String> fileContents = new ArrayList<>();
        List<String> secondContact = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null && i <= 6) {
                if (i == 4) {
                name = line;
            } else if (i == 6) {
                state = line.substring(line.indexOf(" ") + 1 , line.indexOf(" ") +3);
                secondContact.add(name + " state: " + state);
            }
                i++;
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }

        return secondContact;
    }

}
