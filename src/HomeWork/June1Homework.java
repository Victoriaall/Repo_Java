package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;


public class June1Homework {
    public static void main(String[] args) {
        String[] words = {"world","peace","happy","world","happy","grow","peace"};
        System.out.println(Arrays.toString(words));
        System.out.println(getDuplicate(words));
        int[] arr1 = {11, 23, 24, 54, 29, 34};
        int[] arr2 = {23, 54, 11, 55};
        System.out.println( "Old Numbers -> " + Arrays.toString (arr1));
        System.out.println( "Given numbers -> " + Arrays.toString (arr2));
        System.out.println( "Result ->" + commonNumbers(arr1,arr2));


    }

    public static ArrayList getDuplicate(String[] newWords) {
        ArrayList<String> duplicates = new ArrayList<String>();
        for (int i = 0; i < newWords.length; i++) {
            int numberOfTimesFound = 0;
            for (int j = 0; j < newWords.length; j++) {
                if (newWords[i] == newWords[j]) {
                    numberOfTimesFound += 1;
                }
                if (numberOfTimesFound > 1 && !duplicates.contains(newWords[i])) {
                    duplicates.add(newWords[i]);
                }
            }
        }
        return duplicates;
    }

    public static ArrayList commonNumbers(int[] oldNum, int[] givenNum) {
        ArrayList<Integer> common = new ArrayList<Integer>();
        for (int i = 0; i < oldNum.length; i++) {
            for (int j = 0; j < givenNum.length; j++) {
                if (oldNum[i] == givenNum[j]) {
                    common.add(givenNum[j]);
                }
            }
        }
        return common;
    }
}