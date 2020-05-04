package HomeWork;

import java.util.Arrays;

public class SecondHWclass {
    public static void main(String[] args) {
        //  1. Display length of the first name.
        String myName = "Baktygul Victoria Algozhoeva";
        int myNameLength = myName.length();
        System.out.println("Length of my name '" + myName + "' is : " + myNameLength);
        //   2. Does your name starts with "K" (Considering cases)
        boolean isMyNameContainsK = myName.contains("K");
        System.out.println("Does my name contains 'K' : " + isMyNameContainsK);
        String allLowerCaseMyName = myName.toLowerCase();
        boolean kIgnoringCase = allLowerCaseMyName.contains("K"); // searching upper case 'K'
        //among lower case name
        System.out.println("Does my name contains 'K' : " + kIgnoringCase);
        // converting my name to upper case to find 'K'
        String allUppercaseMyName = myName.toUpperCase();
        boolean kConfirmingCase = allUppercaseMyName.contains("K");
        System.out.println("Does my name contains 'K' : " + kConfirmingCase);
        //  3. First alphabet of your name
        char firstIndexMyName = myName.charAt(0);
        System.out.println("First alphabet of my name is : " + firstIndexMyName);
//   4. Does your name ends with "M" (Ignoring cases)
        boolean myNameEndsWithM = myName.equalsIgnoreCase("M");
        System.out.println("Does my name ends with 'M' : " + myNameEndsWithM);

/*   String myStatement = "I am a good programmer";
     Use string methods to do following tasks:
     1. Fetch the last word of the sentence
 	 2. Display the total number of words in the myStatement.
 	 3. replace all the 'r' characters with 'f' characters.
 */
        // 1. Fetch the last word of the sentence.
        String myStatement = "I am a good programmer";
        int myStatementLength = myStatement.length();
        String lastWord = myStatement.substring(myStatementLength - 10);
        System.out.println("Last word of the statement is '" + lastWord + "'");
        // 2.Display the total number of words in the myStatement.
        String[] totalWords = myStatement.split(" ");
        System.out.println(Arrays.toString(totalWords));
        //replace all the 'r' characters with 'f' characters.
        String replaceRToF = myStatement.replaceAll("r", "f");
        System.out.println(replaceRToF);
/*      Store your first name in a string variable.
        Calculate the length of your name, without using length() method of String class.
       */
       int[] arrInt= new int [8];
       int arrIntLength =arrInt.length;
        System.out.println("Length of my name is: " + arrIntLength );








    }

}