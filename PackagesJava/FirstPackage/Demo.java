package PackagesJava.FirstPackage;

class Balance{
    String name;
    int bal;
    Balance(String n,int b){
        name = n;
        bal = b;
    }

    void show(){
        System.out.println(name+" Your balance is $"+bal);
    }
}
public class Demo {
    public static void main(String[] args) {
        Balance obj[] = new Balance[3];
        obj[0] = new Balance("Abhishek", 1000);
        obj[1] = new Balance("Yash", 10000);
        obj[2] = new Balance("Ankit", 100000);

        for(int i=0; i<obj.length; i++) obj[i].show();
    }
}
