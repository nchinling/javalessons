package myapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenIO{

    public static void main(String[] args){

        FileInputStream fis;
        try {
            fis = new FileInputStream("token.txt");

        byte b[] = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        StringTokenizer tk = new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while(tk.hasMoreTokens()){
            s = tk.nextToken();
            System.out.println(s);
            al.add(Integer.parseInt(s));
        }

        System.out.println(al);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}