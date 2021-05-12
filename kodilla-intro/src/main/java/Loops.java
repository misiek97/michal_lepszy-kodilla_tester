public class Loops {
    public static void main(String[] args) {

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfNames = names.length;

        for (int i = 0; i < numberOfNames; i++) {
            String name = names[i];
            System.out.println(name);
        }
    }
    public int sum(int[] numbers) {

        int[] digits = new int[] {21, 2, 13, 14, 95, 6};
        int sum = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum + digits[i];
        }
        return sum;
        System.out.println(sum);
    }
}
