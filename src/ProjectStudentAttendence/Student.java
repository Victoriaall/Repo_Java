package ProjectStudentAttendence;


import HomeWork.printerMethods;

import java.util.Scanner;

public class Student {
    int numStudentAbsentWarning=5;
    int id;
    int numDaysPresent;
    int numDaysAbsentExcused;
    int numDaysAbsentUnexcused;
    String absentNote;


    Student( int id,int numDaysPresent, int numDaysAbsentExcused,int numDaysAbsentUnexcused,String absentNote){
    this.id= id;
    this.numDaysPresent= numDaysPresent;
    this.numDaysAbsentExcused= numDaysAbsentExcused;
    this.numDaysAbsentUnexcused= numDaysAbsentUnexcused;
    this.absentNote= absentNote;
    }


public  void getWarning(){
    int totalAbsent = numDaysAbsentExcused +numDaysAbsentUnexcused;
    if ( totalAbsent > numStudentAbsentWarning){
        System.out.println( "Warning! Too many absents " + totalAbsent);
    }
}
public  void setStudentAttendance(char status){
        if (status =='p'){
            numDaysPresent += 1;
        }
        else if (status =='e'){
            numDaysAbsentExcused += 1;
        }
        else if (status =='u'){
           numDaysAbsentUnexcused += 1;
    }
}
public  void getStudentAttendance(){
    int totalAbsent = numDaysAbsentExcused +numDaysAbsentUnexcused;
    double totalDays =  totalAbsent +numDaysPresent;
    double percentAbsent= totalAbsent/totalDays * 100;
    System.out.println("Student ID:" + id
            + ", Days Present: " + numDaysPresent
            + ", Days Absent Excused: " + numDaysAbsentExcused
            + ", Days Absent Unexcused: " + numDaysAbsentUnexcused
            + ", Percent Absent: " + Math.round(percentAbsent) + "%");
}
public void setStudentAbsentNote (){
        absentNote = " Student ID " + id + " will be absent" ;


}

}