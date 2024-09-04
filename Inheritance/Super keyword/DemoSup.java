class A{
   
    A(int i){
        System.out.println(i);
    }
}
class B extends A{
    B(){
        super(100);
    }
} 
// class C extends B{}
public class DemoSup {
    public static void main(String[] args) {
        B ob = new B();
    }
}
