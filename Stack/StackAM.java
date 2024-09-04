class Test{
    private int values[] = new int[10];
    private int tos;

    Test(){
        tos = -1;
    }

    void push(int item){
        if (tos == 9) {
            System.out.println("Array is full");
        }
        else{
            values[++tos] = item;
        }
    }

    int pop() {
        if(tos < 0) {
        System.out.println("Stack underflow.");
        return 0;
        }
        else
        return values[tos--];
    }
}

public class StackAM {
    public static void main(String[] args) {
        Test ob =  new Test();
        for(int i=0; i<10; i++ ) ob.push(i);
        
    }
}
