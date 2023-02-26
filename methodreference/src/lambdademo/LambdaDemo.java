package lambdademo;

interface MyLambda{
    public int display(String str1, String str2);
}

public class LambdaDemo{

    // public void reverse(String str){
    //     StringBuffer sb = new StringBuffer(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }

    public LambdaDemo(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        // MyLambda ml = System.out::println;

        // LambdaDemo ld = new LambdaDemo();
        // MyLambda ml = LambdaDemo::new;
        // MyLambda ml = LambdaDemo::reverse;

        MyLambda ml = String::compareTo;
        MyLambda ml2 = String::compareToIgnoreCase;

        System.out.println( ml.display("SeetWenshan", "SEETWenshan"));
        System.out.println( ml2.display("SeetWenshan", "SEETWenshan"));
        // ml.display("SeetWenshan", "SeetWenshan");
        // ml.display("ChinLing");
    }
}