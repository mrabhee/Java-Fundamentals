class Test{
    int a;
    int b;
    

    int Area(Test T){
        int x = T.a*T.b;
        return x;
    }
    
}
public class TestOb {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test();
        obj1.a = 10;
        obj1.b = 20;
        int y = obj.Area(obj1);
        int z = obj.Area(obj);
        System.out.println(y);
        System.out.println(z);
        
    }
}
