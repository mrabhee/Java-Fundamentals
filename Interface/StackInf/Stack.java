// package Interface.StackInf;
interface stck{
    void push(int item);
    int pop();
}
class Fixstack implements stck{
    int stcks[];
    private int tos;
    Fixstack(int size){
        stcks =  new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos == stcks.length-1){
            System.out.println("stack is full");
        }
        else{
            stcks[++tos] = item;
        }
    }
    public int pop(){
        if(tos<0){
            System.out.println("stac is empty");
            return 0;
        }
        else{
            return stcks[tos--];
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        Fixstack ob = new Fixstack(10);
        for(int i=0; i<10; i++) ob.push(i);
        for(int i=0; i<10; i++) System.out.println(ob.stcks[i]);
        for(int i=0; i<10; i++) ob.pop();
        for(int i=0; i<10; i++) System.out.println(ob.stcks[i]);
        
        
    }
}
