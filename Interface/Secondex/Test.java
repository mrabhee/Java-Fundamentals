// package Interface.Secondex;
class A{
    interface inf{
        void show();
    }
    void hello(){
        System.out.println("Hello");
    }
}
class B implements A.inf{
    
    public void show() {
        System.out.println("This is a nested interface method implementation");
        
    }
}
public class Test {
    public static void main(String[] args) {
        A.inf ob = new B();
        A oA = new A();
        ob.show();
        oA.hello();
        
    }
}
