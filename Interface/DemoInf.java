package Interface;
interface Demo{
    void show(int i);
}
class A implements Demo{
    public void show(int a){
        System.out.println(a);
    }
    void Hello(){
        System.out.println("Hello");
    }
}
public class DemoInf {
    public static void main(String[] args) {
        Demo ob = new A();
        A obA = new A();
        ob.show(10);
        ob = obA;
        ob.show(122);
        obA.Hello();
        
    }
}
