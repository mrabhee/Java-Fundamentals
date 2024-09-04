package Enumeration;
enum Apple{
    Jonathan(10), GoldenDel(20), RedDel(23), Winesap(30), Cortland(34);

    private int price ;

    Apple(int p){
        price = p;
    }

    int getPrice(){
        return price;
    }

}
public class AppleEnum2 {
    public static void main(String[] args) {
        Apple ap;
        // Price of one of them
        System.out.println("The cost of RedDel is: "+ Apple.RedDel.getPrice());

        for(Apple a : Apple.values()){
            System.out.println(a + " Price is : "+ a.getPrice());
        }
    }
}
