package myapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FOS {
    
    public static void main(String[] args){
        
        try{
            FileOutputStream fos = new FileOutputStream("fos3.txt");
            String str = "I am a expert programmer.";
            byte[] b = str.getBytes();
            // fos.write(b);

            fos.write(b, 7, str.length()-7 );

            fos.close();
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
