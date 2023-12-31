
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");

        String song = scanner.nextLine();

        try (Scanner songFile = new Scanner(Paths.get(song))) {

            while (songFile.hasNextLine()) {

                String a = songFile.nextLine();

                System.out.println(a);
            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }
}
