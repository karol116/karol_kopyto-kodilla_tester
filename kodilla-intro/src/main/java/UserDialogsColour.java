import java.util.Scanner;

public class UserDialogsColour {

    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of colour");
            String firstLetter = scanner.next().trim().toUpperCase();
            switch (firstLetter) {
                case "B":
                    return "Brown";
                case "G":
                    return "Green";
                case "O":
                    return "Orange";
                case "P":
                    return "Purple";
                case "W":
                    return "White";
                case "Y":
                    return "Yellow";
                default:
                    System.out.println("Unidentified colour. Choose another one.");
            }
        }
    }
}