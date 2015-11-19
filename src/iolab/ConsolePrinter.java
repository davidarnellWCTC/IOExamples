
package iolab;

import java.util.*;

/**
 *
 * @author darnell
 */
public class ConsolePrinter implements IMonitorOutput {

//    public ConsolePrinter(List<String> fileContents) {
//        this.fileContents = fileContents;
//    }    
    
    public ConsolePrinter() {
    }
    
    List<String> fileContents;
    
    @Override
    public void printListString(List<String> fileContents){
        this.fileContents = fileContents;
        
        for(String s : fileContents){
            System.out.println(s);
        }        
    }

    @Override
    public void printString(String string) {
        System.out.println(string);
    }

    @Override
    public void printStringArray(String[] string) {
        for (String s: string){
            System.out.println(s);
        }
    }
    
}
