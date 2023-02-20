package myapp;

import java.io.*;


public class ByteDemo{
    
    public static void main(String[] args) throws Exception{

        byte[] b = {'a', 'b', 'l', 'i', 'c', 'l'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // int x;

        // while((x = bis.read()) != -1){
        //     System.out.print((char)x);
        // }

        String str = new String(bis.readAllBytes());
        System.out.println(str);


        bis.close();

    }
}