// package switchcase;
import java.util.Scanner;

public class CurrecyConverter {
    public static void main(String[] args) {
        int monthNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any month number");
        monthNumber = keyboard.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("january");
                break;
            
            case 2:
                System.out.println("fabuary");
                break;
            
            case 3:
                System.out.println("march");
                break;
            
            case 4:
                System.out.println("april");
                break;
            
            case 5:
                System.out.println("may");
                break;
            

            default:
                break;
        }
    }
}
