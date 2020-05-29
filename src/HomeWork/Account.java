/*package HomeWork;
import java.util.Arrays;
import static java.lang.System.exit;
public class Account {
    String ssn;
    double accSum = 1000;
    int maxNumAccounts =5;
    Accounts [] allAccounts = new Account [maxNumAccounts];
    static int startingAccountNumber = 1000;
    int [] allAccountNumbers = new int [maxNumAccounts];
    double [] balance = new double [maxNumAccounts];
    int accountCount= -1;

    public Accounts(String ssn,String accType,double amount){
    switch (accountType.toLowerCase9()){
        case "saving":
        case "savings":
            if ( amount >= accSum){
                this.ssn = ssn;
                System.out.println("Create a savings account");
            } else {
                System.out.println("Amount is less then requited");
                exit(1);
            }
            break;
        case "checking":
            if (amount >= accSum){
                this.ssn = ssn;
                System.out.println(" Create a Checking account");
            }else{
                System.out.println("Amount is less then required");
                exit(1);
            }
            break;
        default:
    }

    }
    public double deposit ( double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount to deposit->" + amount);
        }
        return balance;
    }
    public double withdraw( double amount){
        if ( amount >0 && amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println(" Invalid amount to withdraw->" + amount);
        }
        return balance;
    }
    public void checkBalance (){
        System.out.println( "Name:" + name+
                "\nAccount Number:" + accNum+
                        "\nBalance:" + balance);
    }
}*/