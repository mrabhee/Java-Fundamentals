class Shape{
    int radius;
    public void dimentions(){
        System.out.println("Dimentions of cicle are :\n"+"Radius is : "+radius+"\nDiameter is : "+(2*radius));
    }
}
class Circle extends Shape{
    public void diameter(){
        System.out.println("Diameter is : "+(2*radius));
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.radius = 20;
        obj.diameter();
        obj.dimentions();
    }
}
