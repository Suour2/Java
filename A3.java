/* Bailey Garrett
 * module 1 assignment 3 
 * 1/18/24 
 * identicle arrays 
 */

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // Prompt the user to enter the first 3x3 array
        System.out.print("Enter list 1: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // Prompt the user to enter the second 3x3 array
        System.out.print("Enter list 2: ");
        for (int k = 0; k <= 2; k++) {
            for (int l = 0; l <= 2; l++) {
                m2[k][l] = input.nextInt();
            }
        }

        // close scanner
        input.close();

        // Display whether the two arrays are identical by calling a method
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    // Method to check if two 3x3 arrays are identical
    // if a number in list 1 exist in list 2, increment x by 1 and delete the value
    // from list 2 to prevent duplicate number issues
    // if x = 9 then all numbers had a match and the list are identicle, otherwise
    // they are not.
    private static boolean equals(int[][] m1, int[][] m2) {
        int x = 0;
        // loop through list 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // loop through all list 2 for every number of list 1
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        // if list 1 and list 2 have a match, delete matched number from list 2 and exit
                        // list 2 loop, increment x
                        if (m1[i][j] == m2[k][l]) {
                            x += 1;
                            m2[k][l] = 0;
                            k = 3;
                            l = 3;
                        }
                    }
                }

            }
        }
        // if all 9 numbers had a match return true
        if (x == 9) {
            return true;
        }
        // return false if true is not sent
        return false;
    }
}