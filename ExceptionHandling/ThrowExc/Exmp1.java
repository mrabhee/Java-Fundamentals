// package ExceptionHandling.ThrowExc;

public class Exmp1 {
    static void Demo(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("caught by demo method : "+e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            Demo();
        }catch(NullPointerException e){
            System.out.println("Recaught error : "+e);
        }
    }
    
}
