package ExceptionHandling.ThrowsExp;

/**
 * Exmp1
 */
public class Exp1 {
    static void throwsdemo() throws IllegalAccessException{
        System.out.println("Inside the ThrowsDemo method");
        throw new IllegalAccessException("demo");

    }
    public static void main(String[] args) {
        try {
            throwsdemo();
        } catch (IllegalAccessException e) {
            System.out.println("Erro "+e);
        }
    }
    
}