class A{
    void call(){
        System.out.println("Class A");
    }
}
class B extends A{
    void call(){
        System.out.println("Class B");
    }
}
class C extends B{
    void call(){
        System.out.println("Class C");
    }
}
public class DyDis {
    public static void main(String[] args) {
        A obA = new A();
        B obB = new B();
        C obC = new C();

        A r = obA;
        r.call();

        r = obB;
        r.call();
        
        r = obC;
        r.call();
    }
}
