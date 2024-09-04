class A {
    int i;
    
}
class B extends  A{
    int i = 20;
    int sum(int x){
        super.i = x;
        int y = i;
        return x+y;
    } 
}
public class Super2Class {
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob.sum(122));
    }
}
