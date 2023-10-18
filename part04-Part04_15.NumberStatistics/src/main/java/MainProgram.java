
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers");

        MeinCode userStats = new MeinCode();
        MeinCode userEvenStats = new MeinCode();
        MeinCode userOddStats = new MeinCode();


        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {

                System.out.println("Sum: " + userStats.sum());
                System.out.println("Sum of even numbers: " + userEvenStats.sum());
                System.out.println("Sum of odd numbers: " + userOddStats.sum());

                break;
            } else {

                userStats.addNumber(userInput);
                if(userInput % 2 == 0 ){
                    userEvenStats.addNumber(userInput);
                } else {
                    userOddStats.addNumber(userInput);
                }

                System.out.println("Enter numbers");

            }
        }
    }
}