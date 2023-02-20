package myapp;

import java.io.File;

public class FileHandling{
    public static void main(String[] args){

        File f = new File("/mnt/c/Users/nchin/Documents/java/file");
        System.out.println(f.isDirectory());

        File list[] = f.listFiles();

        for (File x: list)
        {
            System.out.println(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
}