package myapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Fr {
    
    public static void main(String[] args){
        
        try (FileReader fr = new FileReader("ling.txt")) {
    
           int x;

           while(( x = fr.read())!=-1){
            System.out.print((char)x);
           }

            fr.close();
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}