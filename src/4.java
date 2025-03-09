import java.util.*;

public class MyRandomNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNum = rand.nextInt((10 - 5) + 1) + 5;
    System.out.println("Random number between 5 and 10: " + randomNum);
  }
}
