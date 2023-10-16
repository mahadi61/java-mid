import java.math.BigInteger;
import java.util.Scanner;

public class addSmallLarge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        BigInteger num1 = new BigInteger(firstNumber);
        BigInteger num2 = new BigInteger(secondNumber);

        // Perform addition
        BigInteger sum = num1.add(num2);

        System.out.println("Sum: " + sum);
    }
}
