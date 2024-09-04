
//Class is a template or blurprint.
//Object is a real time entity.


/**
 * InnerFirstclass
 */
 class InnerFirstclass {
    public int sum(int a,int b){
        return a+b;
    }
    
}

public class Firstclass {
    public static void main(String[] args) {
        InnerFirstclass obj = new InnerFirstclass();
        int a = obj.sum(10,20);
        System.out.println(a);
    }
}
