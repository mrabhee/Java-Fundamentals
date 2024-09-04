package Interface.Multipleinheritance;
interface A{
    default void show(){
        System.out.println("inf A");
    }
}
interface B {
    default void show(){
        System.out.println("inf B");
    }
}
class C implements A,B{
    public void show(){
        System.out.println("show");
    }
}
public class test {
    public static void main(String[] args) {
        C oc = new C();
        oc.show();
        
    }
}


/// Another example of this programmm

/* 
interface A{
    void show();
}
interface B extends A{
    void show();
    
}
class C implements B{
    public void show(){
        System.out.println("show");
    }
}
public class test {
    public static void main(String[] args) {
        A oa;
        B ob;
        C oc = new C();
        oc.show();
        oa = oc;
        oa.show();
        ob = oc;
        ob.show();
    }
}
*/