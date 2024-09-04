import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

class Test{
    int x;
    int y;
    int Area;
    Test(Test A){
        this.x = A.x;
        this.y = A.y;
        Area = x*y;
        System.out.println("Area of objnew:"+Area);
        
    }
    Test(){
        //NO ARGUMENT CONSTRUCTOR FOR EXECUTING THE PROGRAM
    }
    

}
public class Consobj {
    public static void main(String[] args) {
    
        Test obj = new Test();
        obj.x = 20;
        obj.y = 30;
        Test objnew = new Test(obj);//Creating a clone for the main obj
        int h = objnew.Area;
        System.out.println(h);

        
    }
}
