public class GradesPlay {
    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(15);
        grades.add(25);
        grades.add(35);

        int average = grades.getAverage();
        int lastGrade = grades.getLastGrade();
        System.out.println("Average value:");
        System.out.println(average);
        System.out.println("Last grade:");
        System.out.println(lastGrade);

    }
}