/***  package MultiThreading;
 * 
// Second way tp create thread using implement Runnable

class Newthread implements Runnable{
    Thread t;
    
    Newthread(){
        t = new Thread(this , "Demo thread");
        System.out.println("Child Thread: "+t);
        t.start();
    }

    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("child Thread : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("child intrupt");
        }
        System.out.println("Exit from child thread");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        new  Newthread();
        try {
            for(int i=5; i>0; i--){
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("main thread intrupt");
        }
        System.out.println("main thread exit");
    }
}
***////


/// Second way tp create thread using extend Thread


class Newthread extends Thread{
    
    
    Newthread(){
        super("Demo thread");
        System.out.println("Child Thread: "+this);
        start();
    }

    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("child Thread : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("child intrupt");
        }
        System.out.println("Exit from child thread");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        new  Newthread();
        try {
            for(int i=5; i>0; i--){
                System.out.println("main thread : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("main thread intrupt");
        }
        System.out.println("main thread exit");
    }
}