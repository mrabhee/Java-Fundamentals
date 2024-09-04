class Test{
    
    final static int a = 100; //Example of final varible
    static int b;
    static int sum(int x){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        return 0;
    }
    static{
        System.out.println("Executed-1");
        b=a*3;
    }
}
public class StaticUse {
    public static void main(String[] args) {
        //Test.a=1; //Error
        Test.sum(10); 

    }
}
