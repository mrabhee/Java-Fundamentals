class Square{
    public void area(int side){
        System.out.println("Area of Square is: "+(side*side));
    }
}
class SquareA extends Square{
    int SideOfA = 20;
}
class SquareB extends Square{
    int SideOfB = 30;
}
public class Multipleclass {
    public static void main(String[] args) {
        SquareA obj_1 = new SquareA();
        int A = obj_1.SideOfA;
        obj_1.area(A);
    }
}
