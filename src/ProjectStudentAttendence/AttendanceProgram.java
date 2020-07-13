package ProjectStudentAttendence;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AttendanceProgram<user1> {

    public static void main(String[] args) {

        HashMap<String, HashMap<String, String>> users = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> user1 = new HashMap<String, String>();
        HashMap<String, String> user2 = new HashMap<String, String>();
        user1.put("id", "123");
        user1.put("password", "abc");
        user1.put("type", "student");
        user1.put("numDaysPresent", "7");
        user1.put("numDaysAbsentExcused", "33");
        user1.put("numDaysAbsentUnexcused", "22");
        user1.put("absentNote", "");

        user2.put("id", "124");
        user2.put("password", "def");
        user2.put("type", "student");
        user2.put("numDaysPresent", "17");
        user2.put("numDaysAbsentExcused", "13");
        user2.put("numDaysAbsentUnexcused", "12");
        user2.put("absentNote", "");

        users.put("becky", user1);
        users.put("mary", user2);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Username or type Exit");
            String entry = input.next();
            if (entry.equalsIgnoreCase("exit")) {
                break;
            }

            HashMap<String, String> theUser = users.get(entry);

            System.out.println("Enter Password");
            String password = input.next();
            if (!password.equals(theUser.get("password"))) {
                System.out.println(" Password Incorrect");
                continue;
            }
            Student s1 = new Student(
                    Integer.parseInt(theUser.get("id")),
                    Integer.parseInt(theUser.get("numDaysPresent")),
                    Integer.parseInt(theUser.get("numDaysAbsentExcused")),
                    Integer.parseInt(theUser.get("numDaysAbsentUnexcused")),
                    theUser.get("absentNote"));
            s1.getWarning();
            s1.getStudentAttendance();
            System.out.println("Are you going to be absent say yes or no");// student class
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")){
                s1.setStudentAbsentNote(); // this is called by student
            }

        }
    }
}
        /*s 1 Username: becky
              Password: abc
    }*/


