// package Interface.Multipleinheritance;
interface A{
    default void show(){
        System.out.println("this is default method");
    }
    void show2();
    static String stshow(){
        return "hello";
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        
        String a = A.stshow();
        System.out.println(a);
    }
}
