import java.util.Random;
class RandomNumbers {
    public static void main(String args[]) {
        Random rand = new Random();   //instance of random class
        int maxValue = 31;        //generate random values from 0-30
        int int_random = rand.nextInt(maxValue);

        int sum = int_random++;
        if (sum < 5000) {


        }

    }
}