public class LeapYear {
    public static void main(String[] args) {
        int yourYear = 2021;
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