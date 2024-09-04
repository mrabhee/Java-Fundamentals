class One{
    int i;
    void Show(){
        System.out.println(i);
    }
}
class Two extends One{
    
    int j ;
    Two(int x,int y){
        i = x;
        j = y;
        System.out.println(j);
    }
    
}
public class RefSubclass {
    public static void main(String[] args) {
        
        One obj1 =  new One();
        obj1.Show();
        Two obj2 = new Two(10 , 20);
        

        // obj1 = obj2;
        // System.out.println(obj2.i);
        // System.out.println(obj2.j);
        // System.out.println(obj1.i);
        // // System.out.println(obj1.j);
        

    }

    
}
