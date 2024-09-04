 class InnerCBR {
    int a,b;
    InnerCBR(int i,int j){
        a = i;
        b = j;
    }
    void math(){
        a *= 2;
        b /= 2;
    }
    
}
public class CBR {
    public static void main(String[] args) {
        InnerCBR obj = new InnerCBR(12 ,23);
        System.out.println("Before call "+obj.a+" "+obj.b);
        obj.math();
        System.out.println("After call "+obj.a+" "+obj.b);
    }
}
