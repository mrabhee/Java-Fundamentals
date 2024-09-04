package ExceptionHandling.Finally;

public class FinallyDemo {
    static void Demo1(){
        try{
            System.out.println("inside demo1");
            throw new RuntimeException("Demo");
        }finally{
            System.out.println("Demo1 Finally");
        }
    }
    static void Demo2(){
        try{
            System.out.println("inside demo2");
            return;
        }finally{
            System.out.println("Demo2 Finally");
        }
    }
    static void Demo3(){
        try{
            System.out.println("inside demo3");
        }finally{
            System.out.println("Demo3 Finally");
        }
    }
    public static void main(String[] args) {
        try{
            Demo1();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        Demo2();
        Demo3();
    }
}
