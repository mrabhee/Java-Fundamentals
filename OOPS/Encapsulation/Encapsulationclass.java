import java.util.Scanner;
class Calculation{
    int a;
    int b;
    public void sum(){
        System.out.println("Sum.. of x and y is "+(a+b));
    }
    public void sub(){
        System.out.println("Sub.. of x and y is "+(a-b));
    }
    public void div(){
        System.out.println("Div.. of x and y is "+(a/b));
    }
    public void mul(){
        System.out.println("Mul.. of x and y is "+(a*b));
    }
}


public class Encapsulationclass {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        System.out.println("Enter what you want to do: \n1.Sum\n2.Sub\n3.Div\n4.Mul");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value == 1) {
            System.out.println("Enter the value of X:");
            int x = sc.nextInt();
            System.out.println("Enter the value of Y:");
            int y = sc.nextInt();
            obj.a=x;
            obj.b=y;
            obj.sum();
        }
        else if (value == 2) {
            System.out.println("Enter the value of X:");
            int x = sc.nextInt();
            System.out.println("Enter the value of Y:");
            int y = sc.nextInt();
            obj.a=x;
            obj.b=y;
            obj.sub();
        }
        else if (value == 3) {
            System.out.println("Enter the value of X:");
            int x = sc.nextInt();
            System.out.println("Enter the value of Y:");
            int y = sc.nextInt();
            obj.a=x;
            obj.b=y;
            obj.div();
        }
        else if (value == 4) {
            System.out.println("Enter the value of X:");
            int x = sc.nextInt();
            System.out.println("Enter the value of Y:");
            int y = sc.nextInt();
            obj.a=x;
            obj.b=y;
            obj.mul();
        }
        else{
            System.out.println("Enter valid value");
        }
        
    }
}
