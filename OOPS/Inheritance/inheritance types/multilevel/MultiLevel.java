class Shape{
    int length;
    int width;
    int side;

}
class Square extends Shape{
    public void areaofsq(){
        System.out.println("Area of sqaure is : "+(side*side));
    }
}
class Rectangle extends Shape{
    public void areaofrc(){
        System.out.println("Area of rectangle is : "+(length*width));
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Square sc = new Square();
        sc.side = 10;
        sc.areaofsq();
        Rectangle rc = new Rectangle();
        rc.length = 20;
        rc.width = 10;
        rc.areaofrc();

    }
}
