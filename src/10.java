import java.util.Random;
public class JavaCodeGenerator {
	public static void main(String[] args) {
		int choice = new Random().nextInt(4);
		switch (choice) {
		case 0:
			System.out.println("Hello, World!");
			break;
		case 1:
			System.out.println("I'm feeling lucky today.");
			break;
		case 2:
			System.out.println("I'm not sure what to say.");
			break;
		case 3:
			System.out.println("I'm thinking about my next meal.");
			break;
		}
	}
}