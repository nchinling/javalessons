package myapp;

public class WrapperDemo{

    public static void main(String[] args) {
        
    //    Integer i = new Integer(10);

       Integer a = Integer.valueOf(100);
       Integer b = 5;

       Byte c = 13;
       Byte d = Byte.valueOf("16");
       Byte e = Byte.valueOf((byte) 3);

       Character k = Character.valueOf('s');

       Float g = 12.3f;

       float x = g.floatValue();
       System.out.printf("%f\n", x);

       //autoboxing
       int m = 10;
       Integer n = m;
       int p = n;

       Integer dbs = Integer.reverse(32);
       System.out.println(">>>"+dbs);

       StringBuffer sb = new StringBuffer("Hello World");
       sb.append(" Chin Ling");
       System.out.println(sb);
       sb.append(" the Great");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);

       int i = 256;
       System.out.println(Math.signum(i));

       float ab = 5/2;
       System.out.println(Math.ceil(ab));


    }
}