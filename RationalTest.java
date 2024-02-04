import java.math.BigInteger;
import java.util.Scanner;

public class RationalTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for first rational number
        System.out.print("Enter the first rational number: ");
        BigInteger num1 = input.nextBigInteger();
        BigInteger den1 = input.nextBigInteger();
        Rational rational1 = new Rational(num1, den1);

        // prompt for second rational number
        System.out.print("Enter the second rational number: ");
        BigInteger num2 = input.nextBigInteger();
        BigInteger den2 = input.nextBigInteger();
        Rational rational2 = new Rational(num2, den2);

        // perform calculation
        Rational sum = rational1.add(rational2);
        Rational difference = rational1.subtract(rational2);
        Rational product = rational1.multiply(rational2);
        Rational quotient = rational1.divide(rational2);

        // print
        System.out.println(rational1 + " + " + rational2 + " = " + sum);
        System.out.println(rational1 + " - " + rational2 + " = " + difference);
        System.out.println(rational1 + " * " + rational2 + " = " + product);
        System.out.println(rational1 + " / " + rational2 + " = " + quotient);
        System.out.println(rational2 + " is " + rational2.doubleValue());

        // close scanner
        input.close();
    }
}
