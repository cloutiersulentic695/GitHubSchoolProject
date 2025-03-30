import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Welcome, " + name + "! Let's start coding!");
        while (true) {
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Addition calculation for " + name + ":");
                    double num1, num2;
                    num1 = Double.parseDouble(scanner.nextLine());
                    num2 = Double.parseDouble(scanner.nextLine());
                    double result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.println("Subtraction calculation for " + name + ":");
                    double num1, num2;
                    num1 = Double.parseDouble(scanner.nextLine());
                    num2 = Double.parseDouble(scanner.nextLine());
                    double result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.println("Multiplication calculation for " + name + ":");
                    double num1, num2;
                    num1 = Double.parseDouble(scanner.nextLine());
                    num2 = Double.parseDouble(scanner.nextLine());
                    double result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.println("Division calculation for " + name + ":");
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        double num1, num2;
                        num1 = Double.parseDouble(scanner.nextLine());
                        num2 = Double.parseDouble(scanner.nextLine());
                        double result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
                    continue;
            }
            
            System.out.println("\nWould you like to perform another calculation? (yes/no)");
            String choiceYesNo = scanner.nextLine();
            if (choiceYesNo.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Please select an option and try again.");
            }
        }
    }
}
