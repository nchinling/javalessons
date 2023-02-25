package atm;

public class Customer extends Thread {
    
    ATM atm;
    int cool;
    String name;
    int amount;

    //Constructor
    public Customer(String name, ATM atm, int amount){
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }

    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run(){
        useATM();
    }

}
