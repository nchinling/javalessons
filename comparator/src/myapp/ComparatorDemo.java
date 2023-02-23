package myapp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

class My implements Comparator<Integer>{

    public int compare(Integer i1, Integer i2){
        if (i1 <i2)
            return 1;
        if (i1 > i2)
            return -1;
        return 0;
    }
}

public class ComparatorDemo{

    public static void main(String[] args) {
        
        // int a[] = {2,2,3,4,5,6,6};
        // int b[] = {1,2,3,4,5,6,7};
        // int a[] = {20,2,3,15,5,6,7};

        // int[] c = Arrays.copyOf(a,a.length);

        Integer b[] = {1,2,3,4,5,6,7};
        Integer a[] = {20,2,3,15,5,6,7};

        Integer[] c = Arrays.copyOf(a,a.length);

        Arrays.sort(a, new My());
        for(Integer x: a)
        System.out.println(x);
        System.out.println(">>" + Arrays.binarySearch(a,20));

        // System.out.println(Arrays.compare(a,b));
    }
}