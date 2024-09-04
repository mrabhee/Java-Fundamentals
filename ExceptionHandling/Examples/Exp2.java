package ExceptionHandling.Examples;
import java.util.Random;

public class Exp2 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r = new Random();
        for(int i=0; i<10; i++){
            try{
                a = r.nextInt();
                b = r.nextInt();
                c = 12345/(a/b);
            }
            catch(Exception e){
                System.out.println("Error : "+e);
                c = 0;
            }
            System.out.println("c is "+c);
        }
    }
}
