public class Loops {
    public static void main(String[] args) {

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfNames = names.length;

        for (int i = 0; i < numberOfNames; i++) {
            String name = names[i];
            System.out.println(name);
        }
        int[] numbers = new int[] {21, 2, 13, 14, 95, 6};
        int sum = sum(numbers);
        System.out.println(sum);
    }
    public static int sum(int[] numbers) {

        int sum = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
