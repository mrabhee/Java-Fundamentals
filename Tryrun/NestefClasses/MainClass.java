class Outer{
    static int a = 20;
    class Inner{
        // inner method
        // int sum(int a,int b){
            //     return a+b;
            // }
            
            static int x = a;
            
            
            
        }
        int b = Inner.x;
        
    
    //Using constructor
    // Outer(int x,int y){
    //     Inner obj =  new Inner();
    //     int j =  obj.sum(x,y);
    //     System.out.println("sum of x and y is : "+j);
    // }
    
}

class MainClass{
    public static void main(String[] args) {
        Outer ob = new Outer();
        
        System.out.println(ob.b);
    }
}