class Box{
    private int width;
    private int height;
    private int depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(int w,int h ,int d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        height =-1;
        width =-1;
        depth =-1;
    }
    Box(int len){
        width = height = depth = len;
    }
    int Volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    int weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(int w, int h , int d , int m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight =-1;
    }
    BoxWeight(int len,int m){
        super(len);
        weight = m;
    }
}
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight m1 = new BoxWeight(10,20);
        BoxWeight m2 = new BoxWeight(10,20,30,40);
        BoxWeight m3 = new BoxWeight(m2);
        BoxWeight m4 = new BoxWeight();

        int vol4 = m4.Volume();
        int vol3 = m3.Volume();
        int vol2 = m2.Volume();
        int vol1 = m1.Volume();
        //Volume of all objects
        System.out.println(vol1);
        System.out.println(vol2);
        System.out.println(vol3);
        System.out.println(vol4);
        // weight of all objects
        System.out.println(m1.weight);
        System.out.println(m2.weight);
        System.out.println(m3.weight);
        System.out.println(m4.weight);
    }
}
