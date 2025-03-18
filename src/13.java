import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    int min = 1;
    int max = 100;
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    System.out.println("Random number: " + randomNum);
  }
}