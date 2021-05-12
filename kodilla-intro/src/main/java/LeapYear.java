import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter year:");
        Scanner scaner = new Scanner(System.in);
        String s = scaner.nextLine();

        int yourYear = Integer.parseInt(s);
        int check4 = yourYear % 4;
        int check100 = yourYear % 100;
        int check400 = yourYear % 400;

        System.out.println(yourYear);

        if (check4 == 0 && check100 == 0 && check400 == 0) {
            System.out.println("is the leap year");
        } else if (check4 == 0 && check100 > 0) {
            System.out.println("is the leap year");
        } else {
            System.out.println("is not a leap year");
        }

    }
}