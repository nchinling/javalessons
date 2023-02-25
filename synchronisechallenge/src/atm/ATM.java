package atm;

public class ATM{
    private String name;

    // public ATM(String name){
    //     this.name = name;
    // }

    synchronized public void checkBalance(String name){
        this.name = name;

        System.out.print(name + "checking");
        try{Thread.sleep(1000);} catch(Exception e){}

        System.out.println(" balance. ");
    }

    synchronized public void withdraw(String name, int amount){
        System.out.println(name + "withdrawing");
        try{Thread.sleep(1000);} catch(Exception e){}
        System.out.println(amount);
    }
}