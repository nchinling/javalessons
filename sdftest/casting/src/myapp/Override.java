package myapp;

class Override{

    public static void main(String[] args){

        // Super su = new Super();
        // su.display();

        // Sub subs = new Sub();
        // subs.display();


        //upcasting. sub cannot access Sub methods.
        Super sub = new Sub();
        sub.display();

        //downcasting
        Sub b = (Sub)sub;
        b.display2();
        
        // if (sub instanceof Sub){
        
        // }
    }
}

class Super{
    public void display(){
        System.out.println("Hello");
    }
}

class Sub extends Super{
    public void display2(){
        System.out.println("Hello, welcome!");
    }
}