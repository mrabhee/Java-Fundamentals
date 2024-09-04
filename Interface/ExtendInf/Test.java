package Interface.ExtendInf;
interface A{
    void show();
    default void showdef(){
        System.out.println("this method is default");
    }
}
interface B extends A{
    void show2();
}
class C implements B{
    public void show(){
        System.out.println("This is show from A");
    }
    public void show2(){
        System.out.println("This is show from B");
    }
    // public void  showdef(){
    //     System.out.println("this is default from c");
    // }
}
public class Test {
    public static void main(String[] args) {
        C ob = new C();
        ob.show();
        ob.show2();
        ob.showdef();
    }
}
