
class A {
    int n_def = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    
}
class B extends A{

}
class C{
    A obj = new A();
    C(){
        System.out.println(obj.n_pro);
    }
}
public class Hello {
    public static void main(String[] args) {
        A obA = new A();
        B ob = new B();
        C obC = new C();
        
    }
}
