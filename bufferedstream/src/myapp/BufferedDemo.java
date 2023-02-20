package myapp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BufferedDemo{

    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("juliuscaesar.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int x;

            while((x=bis.read())!=-1){
                System.out.print((char)x);
            }

            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}