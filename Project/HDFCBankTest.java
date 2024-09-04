import java.util.Scanner;

class HDFCBank{
    private int customerId;
    public String customerName;
    float Balance;
    public void Withdraw(float amount){
        System.out.println(amount+" Withdrwal Succesfully");
        Balance = Balance-amount;
    }
    public void Deposit(float amount){
        System.out.println(amount+"Depositeda Succesfully");
        Balance = Balance+amount;
    }
    public void Showbalance(){
        System.out.println("Your balance is :"+Balance);
    }

}
class HDFCBankMum extends HDFCBank{

}
public class HDFCBankTest {
    public static void main(String[] args) {
        HDFCBank obj = new HDFCBank();
        System.out.println("Welcome to HDFC Bank");
        System.out.println("Press 1 for withdraw money");
        System.out.println("Press 2 for deposite money");
        System.out.println("Press 3 to chekc your balance");
        System.out.println("Enter 0 to exit");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("Thanks for Choosing "+value);
        if(value == 1){
            System.out.println("Enter amount you want to withdrwal");
            float ams1 = sc.nextFloat();
            obj.Withdraw(ams1);
        }
        else if(value==2){
            System.out.println("Enter amount you want to withdrwal");
            float ams2 = sc.nextFloat();
            obj.Deposit(ams2);
        }
        else if(value==3){

            obj.Showbalance();
        }

        else{
            System.out.println("Thanks for concern.");
        }
    }
    
}