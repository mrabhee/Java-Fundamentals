package MultiThreading.syncronization;

// class Callme {
//     synchronized void call(String msz) {
//         System.out.print("[" + msz);
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             // TODO: handle exception
//             System.out.println("Interupted");

//         }
//         System.out.println("]");

//     }
// }

// class Caller implements Runnable {
//     String msz;
//     Callme target;
//     Thread t;
    

//     public Caller(Callme targ, String s) {
//         target = targ;
//         msz = s;
//         t = new Thread(this);
//         t.start();
//     }

//     public void run() {
//         target.call(msz);
//     }
// }

// class Synch{
//     public static void main(String[] args) {
//         Callme target = new Callme();
//         Caller obj1 = new Caller(target,"World");
//         Caller obj2 = new Caller(target,"Hello");
//         Caller obj3 = new Caller(target,"Abhi");

//         try {
//             obj1.t.join();
//             obj2.t.join();
//             obj3.t.join();
//         } catch (InterruptedException e) {
//             // TODO: handle exception
//             System.out.println("Intrupted");
//         }
//     }
// }


class Callme {
     void call(String msz) {
        System.out.print("[" + msz);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Interupted");

        }
        System.out.println("]");

    }
}

class Caller implements Runnable {
    String msz;
    Callme target;
    Thread t;
    

    public Caller(Callme targ, String s) {
        target = targ;
        msz = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized(target){
            target.call(msz);
        }
    }
}

class Synch{
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target,"World");
        Caller obj2 = new Caller(target,"Hello");
        Caller obj3 = new Caller(target,"Abhi");

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Intrupted");
        }
    }
}