
class Shape{
    int length;
    public void Area(){
        System.out.println("Every shape have an area");
    }
}
class Square{
    @Override
    public void Area(){
        System.out.println("Every Square have an area");
    }
}
public class Overridingclass {

    public static void main(String[] args) {
        // Shape obj1 = new Shape();
        // obj1.Area();
        Square obj2 = new Square();
        obj2.Area();
    }
}