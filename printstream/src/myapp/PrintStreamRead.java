package myapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class PrintStreamRead{

    public static void main(String[] args) {

        try{
        FileInputStream fis = new FileInputStream("class.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);

        br.close();
        fis.close();
        
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
