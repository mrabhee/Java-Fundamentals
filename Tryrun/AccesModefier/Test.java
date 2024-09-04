class Demo{
    int a;
    public int b;
    private int c;
    void getvalue(int i,int j, int k){
        a = i;
        b = j;
        c = k;
        System.out.println(a+" "+b+" "+c);
    }

}

public class Test {
    public static void main(String[] args) {
        Demo ob =  new Demo();
        // ob.c = 20; <<ERROR>>
        ob.getvalue(10, 20, 220);
    }
}
