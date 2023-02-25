package atm;

public class Main {
    public static void main(String[] args) {
        ATM atmKlang = new ATM();
        Customer c1 = new Customer("John", atmKlang, 5000);
        Customer c2 = new Customer("Smith", atmKlang, 2000);

        c1.start();
        c2.start();
    }
}
