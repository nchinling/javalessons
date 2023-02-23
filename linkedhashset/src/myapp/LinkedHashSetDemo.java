package myapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo{
    public static void main(String[] args){

        HashSet<String> lhs = new HashSet<>(10);


        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("D");

        // lhs.forEach(System.out::println);
        //Introduce an iterator
        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
    
