// package OOPS.Inheritance;

/**
 * Inheritanece is a conecpt in which the parent class giver the feature from to the child class and the chile class
 * benefits from the features of the parent class.
 */

/**
 * Shape
 */
class Shape {
    public void area(int lenght,int width){
        System.out.println("Area of Shape is : "+(lenght*width));
    }
    public void peremeter(int lenght,int width){
        System.out.println("peremeter is: "+(2*(lenght+width)));
    }
}


class Square extends Shape {
    int side =  10;
}

class Rectangle extends Shape {
    int lenght = 20;
    int width = 50;
    
}

public class Test {
    public static void main(String[] args) {
        Square sc = new Square();
        sc.area(sc.side,sc.side);
        sc.peremeter(sc.side,sc.side);
        Rectangle  rc = new Rectangle();
        rc.area(rc.lenght,rc.width);
        rc.peremeter(rc.lenght,rc.width);
        
    }
}