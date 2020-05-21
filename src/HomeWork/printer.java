package HomeWork;

public class printer {
    public static void main (String[] args){
        printerMethods p1 = new printerMethods();
        int numPagesToPrint = 91;
        String side= "single";
        int numAddPages = 5;
        int numAddToner = 20;
        p1.print(numPagesToPrint,side);
        p1.addPages(numAddPages);
        p1.addToner(numAddToner);
        p1.checkToner();
        p1.printSummary();

    }

}
