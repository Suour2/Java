/* Bailey Garrett
 * module 2 assignment 3 
 * 1/19/24 
 * binary input test case w/ exception message
 */

 public class BinaryFormatException extends Exception {
    //error message
    public BinaryFormatException() {
        super("Not a binary number");
    }
    //print the input back to the user after the error message, not included in the assignment but I wanted to include this
    public BinaryFormatException(String message) {
        super(message);
    }
}


     

    
