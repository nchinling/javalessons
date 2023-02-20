package myapp;
import java.io.*;


public class ObjectIS{

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("ling.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student)ois.readObject();
        System.out.println(s);

        fis.close();
        ois.close();


    }
}