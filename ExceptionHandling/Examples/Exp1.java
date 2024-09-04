package ExceptionHandling.Examples;

// public class Exp1 {
//     public static void main(String[] args) {
//         int d = 0;
//         int a = 24/d;
//     }
// }

///////

// public class Exp1 {
//     static void show(){
//         int d = 0;
//         int a = 24/d;
//     }
//     public static void main(String[] args) {
//         show();
//     }
// }


///////



public class Exp1 {
    public static void main(String[] args) {
        int d=0,a;
        try{
            a = 42/d;
            System.out.println("After error");
        }
        catch(ArithmeticException i){
            System.out.println("42 cannot be devisible by 0");
        }
        System.out.println("after catch");
        
    }
}