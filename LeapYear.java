import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        boolean LeapYear = leapYear();
        System.out.println(LeapYear);
    }
public static boolean leapYear(){

        boolean leap;
        System.out.println("Wprowadz rok: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0){
            leap = true;
            System.out.println(" Rok: "+year+" jest rokiem przestepnym.");

        }
        else{
            leap = false;
        System.out.println(" Rok: "+year+" nie jest rokiem przestepnym.");
        }

        return leap;

    }
}
