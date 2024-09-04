import java.util.Scanner;
public class carSelector {
    public static void main(String[] args) {
        System.out.println("do you want a car?, answer yes or no");
        Scanner sc =  new Scanner(System.in);
        String ans1 = sc.nextLine();
        
        if (ans1.equals("yes")){
            System.out.println("enter your favorite color red , blue , yellow");
            String ans2 = sc.nextLine();
            if(ans2.equals("red")){
                System.out.println("conragulation you have bought red car");
            }
            else if(ans2.equals("blue")){
                System.out.println("conragulation you have bought blue car");
            }
            else{
                System.out.println("conragulation you have bought yellow car");
            }
        }
        else{
            System.out.println("greate have a nice day");
        }
    }
}
