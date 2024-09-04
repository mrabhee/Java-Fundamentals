package Enumeration;
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland

}
public class AppleEnum {
    public static void main(String[] args) {
        // Apple ap[] = Apple.values();
        System.out.println("Here is the values of all apples");
        // for(int i=0; i<ap.length; i++){
        //     System.out.println(ap[i]);
        // }
        for(Apple a : Apple.values()){
            System.out.println(a);
        }
        System.out.println();
        Apple ap1 = Apple.valueOf("Jonathan");
        System.out.println(ap1);
        
    }
}
