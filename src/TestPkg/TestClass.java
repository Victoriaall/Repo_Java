package TestPkg;


import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        String sentence = "happy new year";
        String[] words = sentence.split(" ");

        words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1).toLowerCase();
        words[1] = words[1].substring(0, 1).toUpperCase() + words[1].substring(1).toLowerCase();
        words[2] = words[2].substring(0, 1).toUpperCase() + words[2].substring(1).toLowerCase();
        sentence = words[0] + " " + words[1] + " " + words[2];
        System.out.println("Sentence with upper first letter " + sentence);
/**
 * Write code to create abbreviation for any given string
 * Example: String msg = "Outfit of the day" //
 * Expected: OOTD //GM HAGDTY
 * String msg = "have a great day to you"
 *
 * //code
 *
 * sout("Abbreviation : " + abr);
 */
        String msg = "have a great day to you";
        String abr = "";
//code
        System.out.println("Abbreviation: " + abr);
        String[] words_1 = msg.split(" ");
        for (int i = 0; i < words_1.length; i++) {
            words_1[i] = words_1[i].substring(0, 1).toUpperCase();
            abr += words_1[i];
        }
        System.out.println("Abbreviation: " + abr);

        String sent = "today is a great day my love ";
        String everySecondUp = " ";
        String[] sent_1 = sent.split(" ");
        for (int i = 0; i < sent_1.length; i++) {
            if (i % 2 == 0) {
                sent_1[i] = sent_1[i].substring(0, 1).toUpperCase() + sent_1[i].substring(1).toLowerCase() + " ";
            } else {
                sent_1[i] = sent_1[i].toLowerCase() + " ";

            }
            everySecondUp += sent_1[i];
        }
        System.out.println("My every second word is upcase:" + everySecondUp);


/**
 * reverse a string
 */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";

        for (int i = message.length(); i > 0; i--) {
            reverseMessage += message.substring(i - 1, i);
        }
        System.out.println("Message : " + message);
        System.out.println("Message in reverse: " + reverseMessage);

        String[] names_1 = {"happy", "peace", "laugh", "love", "grow", "learn"};
        for (int i = 0; i < names_1.length; i++) {
            System.out.println("Name_1 : " + names_1[i]);
        }
        //String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};
        // take values from names-array, print the name if name-length is 5 or more,
        // and print like: Happy (first-letter in uppercase and rest in lowercase
        String[] names_2 = {"happy", "peace", "laugh", "love", "grow", "learn"};
        for (int i = 0; i < names_2.length; i++) {
            if (names_2[i].length() >= 5) {
                names_2[i] = names_2[i].substring(0,1).toUpperCase() + names_2[i].substring(1).toLowerCase();
                System.out.println("Name_2 :" + names_2[i]);}
        }
        String myName = "BakTYgul AlgZHOEVA";
        String correct = "";
        String [] myNameArray = myName.split(" ");
        for (int i = 0;i < myNameArray.length; i++){
            myNameArray[i] = myNameArray[i].substring(0,1).toUpperCase() + myNameArray[i].substring(1).toLowerCase()+ " ";
            correct += myNameArray[i];
        }
        System.out.println( " My correct name : " + correct);
        /**
         * Check if word is palindrome
         */
        String word = "level";  //ecar
        String word_1 = "";
        boolean result =false;
        for ( int i = word.length(); i > 0; i-- ){
            word_1 += word.substring(i - 1, i);}
            if (word_1.equals(word) ){
            result = true;}
        System.out.println("is " + word + " a palindrome: " + result);

    }
}














