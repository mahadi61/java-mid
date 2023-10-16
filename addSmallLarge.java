import java.math.BigInteger;
import java.util.Scanner;

public class addSmallLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();

        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);

        // Add the two numbers
        BigInteger sum = number1.add(number2);

        System.out.println("Sum of the two numbers: " + sum);
    }
    
}
