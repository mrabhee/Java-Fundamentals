class Stack{
    int Stck[] = new int[10];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos==9){
            System.out.println("Stack if full");
        }
        else{
            Stck[++tos] = item;
        }
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is underflow");
            return 0;
        }
        else{
            return Stck[tos--];
        }
    }
}
public class StackTest {
    public static void main(String[] args) {
        Stack obj = new Stack();

        for(int i=0; i<10; i++){
            obj.push(i);
            System.out.print(obj.Stck[i]+" ");
        }
        System.out.println();
        for(int i=0; i<11; i++){
            obj.pop();
            
        }
    }
}
