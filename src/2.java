import java.util.*;

public class RandomCode {

    public static void main(String[] args) {
        // Generate a random integer between 1 and 10
        int randomInt = (int)(Math.random() * 10) + 1;

        // Generate a random string of length 5
        String randomString = new Random().ints(5, 97, 123).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        System.out.println("Random integer: " + randomInt);
        System.out.println("Random string: " + randomString);
    }
}