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

    public double sre() {
        double suma = 0;
        for (int size: grades)
            suma += this.size;
        return suma / grades.length;
    }
    public int lastSize;
    int getSize(){
        return this.size;
    }
    void setSize(int size){
        if(size>=1&&size<=6){
            this.size=size;
        }
    }
}
