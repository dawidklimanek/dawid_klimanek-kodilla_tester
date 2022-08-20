import java.util.Scanner;

public class UserDiColour {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first colour letter from A,B,D:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    System.out.println( "Amarant");
                    break;
                case "B":
                    System.out.println("Biały");
                    break;
                case "D":
                    System.out.println("Darmowy");
                    break;
                default:
                    System.out.println("Wrong letter.Try again.");
                    break;
            }
        }
    }

    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first colour letter:");
        String letter = scanner.nextLine();
        return letter;


    }
}
