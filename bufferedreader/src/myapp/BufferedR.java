package myapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;  


public class BufferedR{

    public static void main(String[] args) throws Exception{
        try {
            FileReader fr = new FileReader("juliuscaesar.txt");
            BufferedReader br = new BufferedReader(fr);  

            // int i;    
            // while((i=br.read())!=-1){  
            // System.out.print((char)i);  
            // }  

      
            while((br.readLine())!= null){  
            System.out.print(br.readLine());  
            }  

            br.close();    
            fr.close();    

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}