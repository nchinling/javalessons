package myapp;

import java.lang.*;

class MyObject{

    @Override
    public String toString()
    {
        return "My Object is Shan Shan";
    }

}

// class MyObject2 extends MyObject{

// }

public class LangDemo{

    public static void main(String[] args) {
        // Object o1 = new Object();

        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        System.out.println(o1.toString()); 
        
        

        // Object o2 = new Object();

        // Object o2 = o1;

        // System.out.println(o1.hashCode());
    }
}