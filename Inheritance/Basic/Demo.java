class A{
    int a , b;
    void showAB(){
        System.out.println("A and B is: "+a+" "+b);
    }
}
class B extends A{
    int c ;
    void showABC(){
        System.out.println("A , B and C are : "+a+" "+b+" "+c);
    }

    void sum(){
        System.out.println("sum of all is : "+(a+b+c));
    }
}
public class Demo {
    public static void main(String[] args) {
        A obA =  new A();
        B obB =  new B();
        obA.a =10;
        obA.b =20;
        obA.showAB();
        System.out.println();
        obB.a = 50;
        obB.b = 70;
        obB.c = 90;
        obB.showABC();
        obB.sum();
        

    }
}
