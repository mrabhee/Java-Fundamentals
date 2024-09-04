 class shape{
    public static  void Rectangle(int l , int b){
        System.out.println("Area of rectangle is : "+l*b);
    }
    public static  void Square(int a){
        System.out.println("Area of Square is : "+a*a);
    }
}


public class driver {
    public static void main(String[] args) {
        shape area = new shape();
        area.Square(20);
        area.Rectangle(20, 40);
    }
}