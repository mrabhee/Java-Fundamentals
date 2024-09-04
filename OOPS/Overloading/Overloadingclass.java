// package OOPS.Overloading;
import java.util.Scanner;
class Shape{
   
    public void Area(int side){
        System.out.println("Area of square is : "+(side*side));
    }
    public void Area(int length,int width){
        System.out.println("Area of Rectangle is : "+(length*width));
    }
    
}
public class Overloadingclass {
    public static void main(String[] args) {
        Shape obj = new Shape();
        System.out.println("Find the Area of: \n1.Square \n2.Rectangle");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        System.out.println(value);
        if (value.equals("Square")) {
            System.out.println("Enter the value of Side:");
            int Sd = sc.nextInt();
            obj.Area(Sd);
        }
        else if(value.equals("Rectangle")){
            System.out.println("Enter the value of Length:");
            int Ln = sc.nextInt();
            System.out.println("Enter the value of Width:");
            int Wd = sc.nextInt();
            obj.Area(Ln, Wd);
        }
        else{
            System.out.println("Enter valid value");
        }
    }
}
