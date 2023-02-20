package myapp;

import java.io.DataOutputStream;
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
        // PrintStream ps = new PrintStream(fos);

        //Using DataOutputStream allows file to be written in the data's 
        //original data type.

        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "Chin Ling";
        s.dept = "NUS CPE";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

        // ps.println(s.rollno);
        // ps.println(s.name);
        // ps.println(s.dept);

        // ps.close();
        // fos.close();
        
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}