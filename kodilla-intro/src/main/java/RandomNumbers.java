import java.util.Random;
class RandomNumbers {
    public static void main(String args[]) {
        Random rand = new Random(); //instance of random class
        int maxValue = 31; //generate random values from 0-30
        int number = rand.nextInt(maxValue);

        int min = 0;
        int max = 0;

        for (int sum = number; sum < 5000; sum += number) {
            number = rand.nextInt(maxValue);

            if (min > number) {
                min = number;
            }

            if (max < number) {
                max = number;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}