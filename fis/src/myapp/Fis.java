package myapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fis {
    
    public static void main(String[] args){
        
        try{
            FileInputStream fis = new FileInputStream("ling.txt");
    
            byte[] b = new byte[fis.available()];
          

            fis.read(b);

            String str = new String(b);

            System.out.println(str);

            fis.close();
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

