package myapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;


public class PropertyDemo{

    public static void main(String[] args) throws Exception{

        Properties p = new Properties();

        p.setProperty("Brand", "Lenovo");
        p.setProperty("Processor", "Ryzen 5 Pro");
        p.setProperty("OS", "Windows 11");
        p.setProperty("Model", "ThinkPad");

        System.out.println(p);
        p.store(new FileOutputStream("Laptop.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("Laptop.xml"), "Laptop");

        // p.loadFromXML(new FileInputStream("Laptop.xml"));
        // System.out.println(p.getProperty("Model"));
        // System.out.println(p);
    }
}