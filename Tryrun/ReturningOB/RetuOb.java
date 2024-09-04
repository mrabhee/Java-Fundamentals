class  Test {

    int a;
    Test(int i){
        a = i;
    }
    Test incbyten(){
        Test ob = new Test(a+10);
        return ob;
    }
}
public class RetuOb {
    public static void main(String[] args) {
        Test ob1 = new Test(10);

        System.out.println("incremeting the value is : "+ob1.a);
        Test x = ob1.incbyten();
        System.out.println("incremented value is : "+x.a);
    }
}
