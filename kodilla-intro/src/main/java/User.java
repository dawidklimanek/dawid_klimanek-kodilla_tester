public class User {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String c) {
        this.name = c;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    User(String c, int a) {
        this.name = c;
        this.age = a;
    }
}


