public class Grades {
    private int[] grades;
    private int size;
    private int a, b;
    private int i = 0;
    private int sum = 0;

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

    public void returnLastGrade(int lastGrade) {
        int value = lastGrade;
        return;
    }

    public double getAverage() {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum/ grades.length;
    }


//    public void returnGradeAverage() {
//        while (i < 10) {
//            this.size = i;
//            this.grades[i] = a;
//            this.grades[i++] = b;
//            sum = sum + a + b;
//            if(i++ == 9)
//                break;
//            i=i+2;
//        }
//        gradeAverage = sum / this.size;
//    }
}
