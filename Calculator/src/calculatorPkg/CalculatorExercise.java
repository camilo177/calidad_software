package calculatorPkg;
import java.util.Scanner;

public class CalculatorExercise {
    public CalculatorExercise(){
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A (the order matters in some operations, please be careful): ");
        float numA = scanner.nextFloat();

        System.out.print("Enter number B: ");
        float numB = scanner.nextFloat();

        Calculator calculator = new Calculator(numA, numB);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();

        float result = 0;

        if (choice == 1) {
            result = calculator.getAddition();
        } else if (choice == 2) {
            result = calculator.getSubtraction();
        } else if (choice == 3) {
            result = calculator.getMultiplication();
        } else if (choice == 4) {
            result = calculator.getDivision();
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Result: " + result);

        scanner.close();
            }
    }

