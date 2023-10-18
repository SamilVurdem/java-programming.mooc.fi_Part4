
public class YourFirstAccount {

    public static void main(String[] args) {

        Account samilsAccount = new Account("Samil's account", 100.0);

        System.out.println("Initial state");
        System.out.println(samilsAccount);

        samilsAccount.deposit(20.0);

        System.out.println("End state");
        System.out.println(samilsAccount);
    }
}
