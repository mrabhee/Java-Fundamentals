class Box{
    int hight , width ;

    // Box(){
    //     System.out.println("Area of Box is: "+(hight*width));
    //     //Empty constructor
    // }

    void Area(){
        System.out.println("Area of Box is: "+(hight*width));
    }
}
class BoxDems extends Box{
    int Weight;
    BoxDems(int h, int w, int m){
        hight = h;
        width = w;
        Weight = m;
        System.out.println("All dems are : "+hight+" "+width+" "+Weight);
    }
}
public class DemoTwo {
    public static void main(String[] args) {
        
        BoxDems obj = new BoxDems(50, 100, 150);
        obj.Area();
    }
}
