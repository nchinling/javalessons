package myapp;

import java.io.*;



public class Char{
    
    public static void main(String[] args) throws Exception{

        char[] c = {'a', 'b', 'l', 'i', 'c', 'l'};

        CharArrayReader cr = new CharArrayReader(c);

        int x;

        while ((x=cr.read())!=-1){
            System.out.println((char)x);
        }

        cr.close();

    



    }
}