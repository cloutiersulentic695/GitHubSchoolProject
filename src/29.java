public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Generate and print a random string of 10 characters
        String randomString = "Random" + new java.util.Random().nextInt(9);
        System.out.println(randomString);

        // Generate and print a random integer between 1 and 5
        int randomNumber = new java.math.Random().nextInt(5) + 1;
        System.out.println("Random number: " + randomNumber);

        // Generate and print a random floating-point number between 0.9 and 1.1
        double randomFloat = Math.random() * (1 - 0.9) + 0.9;
        System.out.println(randomFloat);
    }
}
