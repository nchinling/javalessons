package myapp;
import java.io.*;

class Student implements Serializable{

    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student(int r, String n, float a, String d){

        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t=500;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", avg=" + avg + ", dept=" + dept + ", t=" + t + "]";
    }

    


}

public class ObjectOS{

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("ling.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10, "Ling", 99.5f, "Computer Science");

        oos.writeObject(s);

        oos.close();
        fos.close();


    }
}