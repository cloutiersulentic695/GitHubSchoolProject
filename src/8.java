import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("A random number between 1 and 10: " + rand.nextInt(10));
    }
}
