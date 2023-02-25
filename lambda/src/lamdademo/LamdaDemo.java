package lamdademo;

@FunctionalInterface
interface MyLambda{
    // public void display(String str);
    public int add(int x, int y);
}

@FunctionalInterface
interface CoolLambda{
    public int subtract2(int x, int y, int z);
}

// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }

public class LamdaDemo{
    public static void main(String[] args) {
        // MyLambda m = (s)->{System.out.println(s);};

        // MyLambda m = (a,b) -> {return a+b;};
        // MyLambda m = (a,b) -> a+b;

     
        CoolLambda n = (x, y, z)->x-y-z;

        System.out.println(n.subtract2(60,30, 10)); 

    }
}

