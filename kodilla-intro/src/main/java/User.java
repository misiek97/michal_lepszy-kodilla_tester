public class User {
    String[] name;
    int[] age;
    int size;

    public User() {
        this.size = 0;
    }

    public void addAge(int value) {
        this.age[this.size] = value;
        this.size++;
    }

    public void addName(String value2) {
        this.name[this.size] = value2;
    }

    public int getAverage() {
        int sum = 0;
        int average = 0;
        for (int i = size; i >= 0; i--) {
            sum = sum + age[i];
            average = sum / size;
        }
        return average;

        for (int i = 0; i < size; i++) {
            if (age[i] > average) {
            String name = name[i];
            System.out.println(name);

        }
}
