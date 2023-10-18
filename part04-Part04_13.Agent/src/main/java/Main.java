public class Main {

    public static void main(String[] args) {

        Agent bond = new Agent("James", "Bond");

        // bond.print();

        bond.toString();    // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);

       /* Agent ionic = new Agent("Ionic", "Bond");

        ionic.print();*/


    }
}
