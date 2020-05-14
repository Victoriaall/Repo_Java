package HomeWork;

import javax.crypto.spec.PSource;

public class FifthHWclass {
    public static void main (String[] args){
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "john";
        String message = "";
        FifthHWclass myFifthHWclass = new FifthHWclass();
        message = myFifthHWclass.findPositionOfName(names,nameToSearch);
        System.out.println(message);
        int [] numbers ={1,2,3};
        double average ;
        average= myFifthHWclass.getAverage(numbers);
        System.out.println(average);
        int [] numbers_1 = {45,22,11,65,189,91,100,81};
        int max ;
        max = myFifthHWclass.getMax(numbers_1);
        System.out.println(max);
        int[] scores = {90, 89, 191, 100, 81};
        String[] names_1 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        String message_1 ="";
        message_1 = myFifthHWclass.studentMaxScore(scores,names_1);
        System.out.println(message_1);
    }

     public static String findPositionOfName(String[] names, String nameToSearch) {
        int position = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                position = i + 1;
            }
        }
        if (position == 0) {
            return ( nameToSearch + " not found in the array ");
        } else {
            return ( nameToSearch + " is position -> " + position);}

        }
     public static double getAverage (int[] numbers){
         double total = 0;
         double average = 0;
        for (int i = 0; i< numbers.length; i++){
            total += numbers [i];
        }
            average = total / numbers.length;
        return average;
     }
     public static int getMax (int [] numbers){
        int max = 0 ;
        for (int i=0; i <numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
     }

     public static String studentMaxScore ( int []score, String [] names_1){
        int maxIndex= 0;
        int max =0 ;
        for (int i= 0; i< score.length; i++){
            if ( max < score[i] ){
                    max = score[i];
                    maxIndex=i;
            }
            }
        return  names_1[maxIndex] + " scored the maximum score-> "+ max;
        }

     }




