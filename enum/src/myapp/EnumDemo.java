package myapp;

enum Dept{
    CS, IT, CIVIL, ECE;
}

public class EnumDemo{
    public static void main(String[] args) {
        Dept d = Dept.ECE;
        System.out.println(d.name());

        Dept list[] = Dept.values();
        for(Dept x:list)
        System.out.println(x);

    }
}