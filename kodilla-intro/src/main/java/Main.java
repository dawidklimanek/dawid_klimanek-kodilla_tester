public class Main {
    public String name;
    public int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public static void main(String[] args) {

        User dawid = new User("dawid", 20);
        User iza = new User("iza", 33);
        User karol = new User("karol", 58);
        User[] users = {dawid, iza, karol,};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users.length;
            System.out.println(sum / users.length);

            double sre = (double) sum / 3;
            System.out.println(sre);


                for (int i = 0; i < this.size; i++)

        }
    }
}