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
    double srednia(int a, int b, int c) {
        double result = (a + b) / c;
        return result;
    }
    public int[] getGrades() {
        return grades;
    }
}

