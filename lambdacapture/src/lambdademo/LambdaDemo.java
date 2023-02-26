package lambdademo;

interface MyLambda{
    public void display();
}


class UseLambda{

    public void callLambda(MyLambda ml){
        ml.display();
    }
}

class Demo{

    // int temp = 10;

    public void method1(){
        // int count = 0;

        UseLambda ul = new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});

    //     MyLambda ml=()->{
    //         // int count = 0
    //         // count++;
    //         System.out.println("Hi");
    //         System.out.println("Bye" + temp++);
    // };

    // ml.display();
   

    }
}

public class LambdaDemo{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}