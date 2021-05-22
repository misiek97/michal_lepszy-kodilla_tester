public class GradesPlay {
    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        grades.add(2);

        int average = average(grades);
        System.out.println(average);
    }

    public static int average(int[] grades) {
        int sum = 0;
        int average = 0;
        for (int i = grades.length - 1; i >= 0; i--) {
            sum = sum + grades[i];
            average = sum / grades.length;
        }
        return average;
    }
}