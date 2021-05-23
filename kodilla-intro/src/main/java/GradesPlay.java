public class GradesPlay {
    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        grades.add(2);

        int average = grades.getAverage();
        int lastGrade = grades.getLastGrade();
        System.out.println(average);
        System.out.println(lastGrade);

    }
}