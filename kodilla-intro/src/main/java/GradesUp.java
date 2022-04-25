public class GradesUp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(2);
        grades.add(1);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(4);
        grades.add(1);
        grades.add(5);
        grades.add(1);

        System.out.println(grades.getAverage());
    }
}
