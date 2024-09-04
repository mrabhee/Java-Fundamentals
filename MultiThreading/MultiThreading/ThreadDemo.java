package MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Curren Thread is: "+t);
        t.setName("Thread");
        System.out.println(t);

        try {
            for(int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
