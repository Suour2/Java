/* Bailey Garrett
 * module 2 assignment 3 
 * 1/19/24 
 * binary input test case w/ exception message
 */

//Method to test input for binary, throw exception created if not a valid number
    public static String bin2Dec(String binaryString) throws BinaryFormatException {

    // Check if string is binary
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new BinaryFormatException("Not a binary number");
            }
        }
    //return the string if it is a valid input
        return binaryString;
    }