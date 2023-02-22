package myapp;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args){

         // Create a file object
        
            File f = new File(args[0]);
    
            // Get all the names of the files present in the given directory.
            File[] files = f.listFiles();

            System.out.println("Files are:");
            
            TextStats text = new TextStats();

            String[] names = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                names[i] = files[i].getAbsolutePath();
                System.out.println(names[i]);
                text.process(names[i]);
             }
        
    }
}
