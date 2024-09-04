
class InnerCBY {
    void math(int x,int y){
        x *= 2;
        y /= 2; 
        
    }
}
public class CBY {
    public static void main(String[] args) {
        InnerCBY obj = new InnerCBY();
        int i=10 , j=20;
        System.out.println("before initilize object i and j are: "+i+" "+j);
        obj.math(i,j);
        System.out.println("after initlizing i and j to the object: "+i+" "+j);
    }
}
