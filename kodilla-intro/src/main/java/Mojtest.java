public class Mojtest {
    public static void main(String[]args){
        int myAge = 40;
        if (myAge < 10){
            System.out.println("You're a kid");
        } else if (myAge > 10 && myAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }
    }
}
