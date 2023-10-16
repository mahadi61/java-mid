import java.util.Scanner;

public class tempConvert {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float celsius, fahrenheit , cel, fah;
        // celsius to fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();
        fahrenheit = ((9*celsius)/5)+32;
        System.out.println("Temperature in Fahrenheit: " +fahrenheit);

        // fahrenheit to celsius 
        System.out.print("Enter temperature in Fahrenheit: ");
        fah = sc.nextFloat();
        cel = (5*(fah-32))/9;
        System.out.println("Temperature in celsius: " +cel);

    }
}
