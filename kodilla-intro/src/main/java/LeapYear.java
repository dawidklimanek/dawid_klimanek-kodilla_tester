public class LeapYear {
    public static void main(String[] args) {
        int rok = 2219;
        if (rok % 4 == 0) {
            System.out.println("Ten rok jest przestepny.");
        } else if (rok % 100 != 0 && rok % 400 == 0) {
            System.out.println("Ten rok jest przestepny.");
        } else {
            System.out.println("Ten rok nie jest przestepny.");
        }
    }
}
