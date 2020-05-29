package HomeWork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int numberToRemove = 24;
        Test t1 = new Test();
        System.out.println(Arrays.toString(t1.removeTheNumber(array, numberToRemove)));
        int[] array1 = {1, 3, 5, 4, 2, 7};
        t1.returnMissingNum(array1);
        System.out.println(t1.returnMissingNum(array1));
        int userSpeed= 88;
        t1.speedLimitPoints (userSpeed);
    }
  public int[] removeTheNumber(int[] array, int numberToRemove) {
        int[] newArray = new int[array.length];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if ( numberToRemove != array[i] ) {
                newArray[newIndex] = array[i];
                newIndex += 1;
            }
        }
        return newArray;
        }


    public int returnMissingNum(int[] array1) {
        int max = 0;
        int missingNumber = 1;
        int maxMissingNumber =0;
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        boolean keepGoing = false;
        while ( missingNumber < max && keepGoing ){
            for (int i = 0; i < array1.length; i++){
                if (missingNumber == array1[i]){
                missingNumber +=1;
                keepGoing = true;
            }
        }
        }
        return missingNumber;
      }

    public void speedLimitPoints (int userSpeed) {
    int speedLimit = 70;
    int points = (userSpeed - speedLimit) / 5;
    if ( points == 0 ){
        System.out.println("Thank you for driving within the speed limit.");}
    if (points >= 12){
        System.out.println( points + " points (License suspended)");}
    else {
        System.out.println( points + " points");
    }
}
}


