package HomeWork;

public class ForthHWclass {
    public static void main(String[] args){
        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         *
         */
        String msg = "have a great day to you";
        String abr = "";
//code
        String [] words_1 = msg.split(" ");
        for (int i = 0; i < words_1.length; i++){
            words_1[i] = words_1[i].substring(0,1).toUpperCase();
            abr += words_1[i];
        }
        System.out.println( "Abbreviation: " + abr);


        //String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        //System.out.println("Line (Before modification) : " + line);
        //System.out.println("Line (After modification) : " + line);
        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        String aLine = "";
        String [] newLineWords = line.split(" ");
        for (int i=0 ; i < newLineWords.length; i++){
            newLineWords[i]= newLineWords[i].substring(0,1).toUpperCase()+ newLineWords[i].substring(1).toLowerCase()+" ";
            aLine += newLineWords[i];
        }
        System.out.println( "Line before :" + line );
        System.out.println( "Line after :" + aLine);
        /**
         * reverse a string
         */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";

        for (int i = message.length(); i > 0; i-- ){
            reverseMessage += message.substring(i-1,i);
        }
        System.out.println("Message : " + message);
        System.out.println("Message in reverse: " + reverseMessage);
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


