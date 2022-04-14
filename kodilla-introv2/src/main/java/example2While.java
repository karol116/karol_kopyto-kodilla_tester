import java.util.Random;
import java.util.Scanner;

public class example2While {
    public static void main(String[] args) {
        int random1 = getCountOfRandomNumber();
        System.out.println(random1);
    }
    public static int getCountOfRandomNumber() {
        Random random = new Random();
        System.out.println("Wpisz wartosc maksymalna");
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int result = 1;
        int sum = 0;
        int i = 1;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;

            System.out.println(i+". suma dotychczasowych wylosowanych liczb: "+sum +" ;Wylosowana liczba:  "+temp);
            i++;
            result++;
        }
        return result;

    }

}
