
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String a = scanner.nextLine();

            if(a.equals("end")) {
                break;
            }

            int number = Integer.valueOf(a);

            System.out.println(number * number * number);
        }

    }
}
