/* Bailey Garrett
 * module 1 assignment 2 
 * 1/18/24 
 * credit card evaluation
 * adding all even doubled from right to left 
 * then add all odd from right to left 
 * then add those numbers 
 * if divisible by 10 then valid 
 */

import java.util.Scanner;

class A2 {
    public static void main(String[] args) {
        // invalid
        // String number = "4388576018402626";

        // valid
        // String number = "4388576018410707";
        // ALLOW READING KEYBOARD INPUTS
        Scanner input = new Scanner(System.in);

        // prompt for card number
        System.out.print("Enter card number: ");

        // read input of card number
        String number = input.nextLine();

        // close scanner or get error and code wont run
        input.close();

        // print if valid
        if (isValid(number)) {
            System.out.println(number + " is Valid");
        } else {
            System.out.println(number + " is Invalid");
        }
    }

    // Return true if the card number is valid false if not
    private static boolean isValid(String number) {
        // check if number is less than 13 or larger than 16
        if (number.length() < 13 || number.length() > 16) {
            return false;
        }

        // check for valid starting digits
        char firstDigit = number.charAt(0);

        switch (firstDigit) {
            case '4':
            case '5':
            case '6':
                break;
            case '3':
                // Check for American Express starting digits
                if (number.charAt(1) != '7') {
                    return false;
                }
                break;
            default:
                return false;
        }
        // get sum of doubled even digits
        int sumEven = sumOfDoubleEvenPlace(number);
        // System.out.println(sumEven + " Sum of Even");
        // get sum of doubled odd digits
        int sumOdd = sumOfOddPlace(number);
        // System.out.println(sumOdd + " Sum of Odd");
        // add sums
        int sum = sumOdd + sumEven;
        // check if divisible by 10
        if (sum % 10 != 0) {
            return false;
        }
        return true;
    }

    /** Get the result from Step 2 */
    private static int sumOfDoubleEvenPlace(String number) {
        int sum = 0;
        int digit = 0;
        // loops through all even digits from right to left
        for (int i = number.length() - 2; i >= 0; i -= 2) {
            // gets specific digit in card number
            digit = ((Character.getNumericValue(number.charAt(i))));
            // gets the value of the digit doubled
            int doubleDigit = getDigit(digit);
            // add doubled digit to total
            sum += doubleDigit;
            // System.out.println(doubleDigit + " even digit");
        }
        return sum;

    }

    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digits
    private static int getDigit(int digit) {
        // multiply by 2
        digit = digit * 2;
        // if double digit add digits
        if (digit >= 10) {
            digit = digit / 10 + digit % 10;
        }
        return digit;
    }

    /**
     * Return sum of odd-place digits in number, same as even but starts at -1
     * instead of -2 for odds
     */
    private static int sumOfOddPlace(String number) {
        int sum = 0;
        int digit = 0;
        for (int i = number.length() - 1; i >= 0; i -= 2) {
            digit = ((Character.getNumericValue(number.charAt(i))));
            sum += digit;
            // System.out.println(digit + " odd digit");
        }
        return sum;
    }

    // add sums of even and odds, this was scrapped because it was pointless
    // private static int sumofall(int sumEven, int sumOdd) {
    // return sumEven + sumOdd;
    // }

    /**
     * Return true if the number d is a prefix for number
     * Bailey's note - no idea what the hell this method is supposed to be ahaha?!
     */
    // private static boolean prefixMatched(long number, int d){

    // }

    /**
     * Return the number of digits in d
     * Bailey's notes - I already did this in the first method,
     */
    // private static int getSize(long d){

    // }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     * Bailey's note - no idea what the hell this method is supposed to be either!?
     */
    // private static long getPrefix(long number, int k){

    // }

}