import java.math.BigInteger;

public class factorial {
      public static void main(String[] args) {
        // Calculate factorial for a small number
        int smallNumber = 5;
        BigInteger factorialSmall = calculateFactorial(smallNumber);
        System.out.println("Factorial of " + smallNumber + " is: " + factorialSmall);

        // Calculate factorial for a large number
        int largeNumber = 15;
        BigInteger factorialLarge = calculateFactorial(largeNumber);
        System.out.println("Factorial of " + largeNumber + " is: " + factorialLarge);
    }

    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            // factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
