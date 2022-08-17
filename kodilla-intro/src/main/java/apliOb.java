public class apliOb {
    public static void main(String[] args) {

    }
    String nameA = "adam";
    double ageRange = 30;
    double heightRange = 160;

    public void AppliOb(String name, double age, double height) {

        if (nameA != null) {
            if (age > ageRange && height > heightRange) {
                System.out.println("User is older than" + ageRange + "and taller than" + heightRange);
            } else {
                System.out.println("User is" + (ageRange - 1) + " (or younger) or" + (heightRange - 1) + "(or shorter)");
            }
        }
    }
}
