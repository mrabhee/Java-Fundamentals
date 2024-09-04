class TestOne{
    protected int i = 10; //only acceseble through own class and subclass member or obj
    private int a = 100; //Only accesable through its own obj and class member
     void showa(){
        System.out.println("value of a is: "+a);
       
    }

}

class TestTwo extends TestOne {
    private int j = 1100;
    void show(){
        System.out.println("value of i is: "+i);
        System.out.println("value of j is: "+j);
        // ERROR System.out.println("value of a is: "+a);
    }
    
}
public class AccessmemberInh {
    public static void main(String[] args) {
        TestTwo obj = new TestTwo();
        obj.show();
        obj.showa();
       
        
        
    }
}
