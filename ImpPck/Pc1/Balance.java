package ImpPck.Pc1;

public class Balance {
    String name;
    int bal;
    public Balance(String n,int b){
        name = n;
        bal = b;
    }
    public void show(){
        System.out.println(name+": your balance is: "+bal);
    }
}
