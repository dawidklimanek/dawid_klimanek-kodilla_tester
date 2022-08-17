public class apliOb {
    class Person {
        public String name;
        public double age;
        public double height;


        public Person(String name, double age, double height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }
    class Application
    {
        public static void main(String[] args)
        {
            User adam = new User("Adam", 40.5, 178);
            if(adam.age > 30 && height > 160)
            {
			...
            }
            else
            {
			...
            }
        }
    }