package myapp;

import java.util.*;

public class TokenizerDemo{

    public static void main(String[] args){

        String data = "name=Chin Ling; age = 39; hobby = programming/exercise; profession = craftsman";

        StringTokenizer stk = new StringTokenizer(data, "=;");

        String s;

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }   

}

