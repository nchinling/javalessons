package myapp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class BufferedReader{

    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("juliuscaesar.txt");
            BufferedReader br= new BufferedReader(fr);  

            System.out.print(br.read());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}