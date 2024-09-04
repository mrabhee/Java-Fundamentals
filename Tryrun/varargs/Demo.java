// package Tryrun.varargs;

public class Demo {
    static void vaTest(int v[]){
        System.out.print("number of args: "+v.length+" Content: ");
        for(int x=0; x<v.length; x++){
            System.out.print(v[x]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n1[] = {10,20,39};
        int n2[] = {20,39};
        int n3[] = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
