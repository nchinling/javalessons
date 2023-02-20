package myapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;



class Student{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo{

    public static void main(String[] args) {

        try{
        FileOutputStream fos = new FileOutputStream("class.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "Ling";
        s.dept = "CPE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
        
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}