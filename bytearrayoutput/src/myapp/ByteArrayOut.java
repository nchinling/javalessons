package myapp;

import java.io.*;



public class ByteArrayOut{
    
    public static void main(String[] args) throws Exception{

        // byte[] b = {'a', 'b', 'l', 'i', 'c', 'l'};

        // int b[] = new int[10];

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        // byte[] b = bos.toByteArray();

        // for (byte x : b)
        //     System.out.println((char)x)

        bos.writeTo(new FileOutputStream("ling2.txt"));


        
        bos.close();


    }
}