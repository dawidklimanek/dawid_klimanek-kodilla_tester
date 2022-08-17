import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int sum=0;
        int counter=0;
        int max=0;
        int min=30;
        while(sum<50){
            int number= random.nextInt(31);
            sum=sum+number;
            counter++;
if(number>max) {
    max = number;
}
if(number<min){
    min=number;
}
        }
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(min);
        System.out.println(max);
    }
}
