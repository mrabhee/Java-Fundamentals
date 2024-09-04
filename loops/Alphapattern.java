// package loops;

/**
 * Alphapattern
 */
public class Alphapattern {

    public static void main(String[] args) {
        int alplabet = 65;
        for(int i = 0; i<=5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(alplabet)+" ");
            }
            alplabet++;
            System.out.println();
        }
    }
}