import java.util.Random;
import java.util.Scanner;

public class Grades {
    private int[] grades;
    private int size;
    private Scanner input;

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

    public double sre() {
        double suma = 0;
        for (int i = 0; i < this.size; i++)
            suma += grades[i];
        return (sre());
    }

    public int lastSize;

    int getSize() {
        return this.size;
    }

    void setSize(int size) {
        for (int i = 0; i < 10; i++) {
            int grade = input.nextInt();
            grades. add(grade);
        }
    }
}
