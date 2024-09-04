package ExceptionHandling.Examples;



public class Exp3 {
    public static void main(String[] args) {
        try{
            int a = args.length;
        System.out.println("a is :"+a);
        int b = 42 /a;
        int c[] ={1};
        c[42]= 99;
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error :"+e);
        }
        System.out.println("After Try/Catch block");
    }
}
