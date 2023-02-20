package myapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){
        
        try{
            FileWriter fw = new FileWriter("fos3.txt");
            String str = "I am a expert programmer.";
            fw.write(str);

            

            // fos.write(b, 7, str.length()-7 );

            fw.close();
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
