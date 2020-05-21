package HomeWork;

public class printerMethods {
    int tray = 100;
    int toner = 100;

    public void print(int pages, String side) {
        toner = toner - pages;
        if (side == "single") {
            tray -= pages;
        } else {
            tray -= (pages + 1) / 2;
        }
    }
    public void printSummary() {
        System.out.println("Toner level:" + toner);
        System.out.println("Pages count in tray:" + tray);
    }
    public  void checkToner() {
        if (toner < 10) {
            System.out.println("Add Toner");
        }
        if (tray < 10) {
            System.out.println("Add Paper");
        }
    }
    public void addToner(int numAddToner) {
        toner += numAddToner;
    }
    public void addPages(int numAddPages) {
        tray += numAddPages;
    }
}



