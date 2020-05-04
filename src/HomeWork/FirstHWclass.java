package HomeWork;
/* int d = 5;
        System.out.println(d++);
        System.out.println(d++);
        System.out.println(++d);
        System.out.println(d);
        System.out.println(--d);
        System.out.println(d);
        System.out.println(d++);

1) Store below scenario value in an appropriate dataType variable, and print the same in console.
	1. number of hours in a day
	2. number of max no. of days in a years
	3. total number of employees in an organisation
	4. population in a country
	5. interest rate
	6. balance in a bank account
	7. does the sun rise from the west? Store answer
	8. initials of your name
	9. Your name
2) Implement code to convert temperature values using below formulae:
°F = 9/5 ( °C) + 32
°F = 9/5 (K - 273) + 32
K = °C + 273
°C = K - 273
K = 5/9 (° F - 32) + 273
 */

public class FirstHWclass {
    public static void main(String[] args){
        int d = 5;
        d++;
        System.out.println("d = "+ d);
        d++;
        System.out.println("d = "+ d);
        ++d;
        System.out.println("d = "+ d);
        d = 8;
        System.out.println("d = "+ d);
        --d;
        System.out.println("d = "+ d);
        d = 7;
        System.out.println("d = "+ d);
        d++;
        System.out.println("d = "+ d);

/*1. number of hours in a day*/
        byte hoursDay = 24;
        System.out.println("There are " + hoursDay + " hours in a day.");

/*2. number of max no. of days in a years */
        short daysOfYear = 365;
        System.out.println("There are " + daysOfYear + " days in a year.");

/*3. total number of employees in an organisation*/
        int numberOfEmp = 456;
        System.out.println("There are " + numberOfEmp + " employees in the organization.");

/*4. population in a country */
       int popuMill = 330; // I could do simply 330578810 but I was fun to make nice looking answer.
       int popuThou = 578;
       int popuHund = 810;
        System.out.println("Current population of the country is " + popuMill +","+popuThou+","+popuHund+ " people.");
/*5. interest rate*/
        double interestRate = 3.560;
        System.out.println("Current interest rate is " + interestRate + "%.");
/*6.balance in a bank account */
        double balance = 100;
        System.out.println("Current balance in the bank is " + balance+ " dollars.");
/*7.does the sun rise from the west? Store answer*/
        boolean sunRise = false;
        System.out.println("Does the sun rise from the west? " + false); // I couldn't get the answer "NO"
/* 8. initials of your name*/
        char firstName ='B';
        char lastName ='A';
        System.out.println("My initials are " + firstName+lastName);
        //System.out.println("My initials are " + firstName +" "+lastName); this version is with the space btw B A
        // iF I want to put "." I have to put inside the "" so it will show  B.A
/*9. Your name*/
        String fullName = "Baktygul Victoria Algozhoeva";
        System.out.println("My full name is " + fullName);


        double cTemp = 33; //°F = 9/5 ( °C) + 32
        double fTemp = (9.0/5 * cTemp) + 32;
        System.out.println("Temperature in degrees Fahrenheit " + fTemp);
        double kTemp = 300; //F = 9/5 (K - 273) + 32
        double fTemp_1 = (9.0/5) * (kTemp - 273) + 32;
        System.out.println("Temperature in degrees Fahrenheit " + fTemp_1);
        double cTemp_1 = 35; //K = °C + 273
        double kTemp_1 = (cTemp_1 + 273);
        System.out.println("Temperature in degrees Kelvin " + kTemp_1);
        double cTemp_2 = (kTemp_1 - 273); //°C = K - 273
        System.out.println("Temperature in degrees Celsius " + cTemp_2); // Here I used the same variable kTemp_1 = 308
        double kTemp_2 = (5.0/9) * (fTemp_1 - 32) + 273;//  K = 5/9 (° F - 32) + 273; fTemp_1 = 80.6 ;
        System.out.println("Temperature in degrees Kelvin " + kTemp_2);








    }


}
