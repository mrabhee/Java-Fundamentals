// package Tryrun.varargs;

public class NewDemo {
    static void vaTest(String msz , int ...v){
        System.out.print(msz+" number of args: "+v.length+" Content: ");
        for(int x=0; x<v.length; x++){
            System.out.print(v[x]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n1[] = {10,20,39};
        int n2[] = {20,39};
        int n3[] = {};
        vaTest("hello",n1);
        vaTest("Abhi",n2);
        vaTest("Third",n3);
    }
}