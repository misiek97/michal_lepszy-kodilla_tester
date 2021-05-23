public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getAverage() {
        int sum = 0;
        int average = 0;
        for (int i = size; i >= 0; i--) {
            sum = sum + grades[i];
            average = sum / size;
        }
        return average;
    }

    public int getLastGrade() {
        int lastGrade = grades[size - 1];

        return lastGrade;
    }
}