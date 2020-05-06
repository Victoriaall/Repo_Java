package TestPkg;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import sun.util.calendar.CalendarDate;

import javax.swing.*;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        String sentence = "Hello,dear. how are you";
        boolean newsentence = sentence.length() > 10 ? true : false;
        System.out.println(newsentence);
        /*
         * String fullName = "";
         * String isEnrolled =
         *      Assign "enrolled" if first-name length is greater than 7 or first-name starts with "A"
         *      else "try later"
         *
         * print the isEnrolled value.
         */
        //String fullName = "hello dear how are you";
        int studentScore = 135;
        double maxScore = 150;
//calculate percentage
//Your percentage: XX.yy and your grade is: A
        double scorePercentage = (studentScore / maxScore) * 100;
        char studentGrade;
        if (scorePercentage >= 91) {
            studentGrade = 'A';
        } else if (scorePercentage <= 90 && scorePercentage >= 81) {
            studentGrade = 'B';
        } else if (scorePercentage <= 80 && scorePercentage >= 71) {
            studentGrade = 'C';
        } else if (scorePercentage <= 70 && scorePercentage >= 61) {
            studentGrade = 'D';
        } else if (scorePercentage <= 60 && scorePercentage >= 51) {
            studentGrade = 'E';
        } else {
            studentGrade = 'F';
        }
        System.out.println("Your percentage: " + scorePercentage + " and your grade is: " + studentGrade);
/**
 * Checking car mode (P, D, N, R)
 * if car mode is P and "you can park car"
 * if car mode is D drive car
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car mode is N you can "put car in car wash"
 * if car mode is R you can "revere the car"
 */

        String carType = "eco";
        char carMode = 'd';
        String message_1 = "";
        String message_2 = "";

        String carTypeCase = carType.toLowerCase();
        carMode = Character.toLowerCase(carMode);
        switch ( carMode){
            case 'p':
                message_1 = "You can park car";
                break;
            case 'd':
                message_1 = "You can drive : ";
             switch (carTypeCase) {
                 case "snow":
                     message_2 = "You are on Snow mode";
                     break;
                 case "sport":
                     message_2 = "You are on Sport mode";
                     break;
                 case "eco":
                     message_2 = "You are on Eco mode";
                     break;
             }
             break;
             case 'n':
                 message_1 = "Put car in car wash";
                 break;
             case 'r':
                 message_1 = "Reverse the car";
                break;
        }
        System.out.println("Message : " + message_1 + message_2 );
        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int var = 10;

        if (var % 5 ==0 && var % 3 == 0) {
            System.out.println(" divisible by both");
        }
        else if (var % 5 == 0){
            System.out.println(" divisible by 5");
        }
        else if (var % 3 == 0){
            System.out.println(" divisible by 3");
        }
        else{
            System.out.println( + var );
        }
    }

    }

