package nl.um.dacs;

import java.util.Scanner;

public class FizzBuzz 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(scanner.nextInt()));
        scanner.close();
    }

    String fizzBuzz(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        if (n % 3 == 0 && n % 5 == 0) {
            return "fizz buzz";
        } else if (n % 3 == 0) {
            return "fizz";
        } else if (n % 5 == 0) {
            return "buzz";
        } else {
            return Integer.toString(n);
        }
    }
}
