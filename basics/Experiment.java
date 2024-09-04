// class Experiment {
//     public static void main(String args[]) {
//         // int twoD[][] = new int[2][2];
//         // twoD[0][0] = 1;
//         // twoD[0][1] = 2;
//         // twoD[1][0] = 3;
//         // twoD[1][1] = 4;
//         // int i;
//         // int j;
//         // for(i=0; i<twoD.length; i++){
//         //     for(j=0; j<=i+1; j++){
//         //         if (j==2) {
//         //             continue;
//         //         }
//         //         else{
//         //             System.out.print(twoD[i][j]+" ");
//         //         }
//         //     } 
//         //     System.out.println();
//         // }  
        
//         // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
//         // for(int x : arr){
//         //     System.out.println("value in arr["+(x-1)+"]: "+x);
//         // }
        
//             boolean t = true;
//             System.out.println("Before the return.");
//             if (t) {
//                 return;
//             }
//             System.out.println("After the return");
//     }
// }


// Class and Object

class Box{
    
    int width;
    int height;
   
    Box(int width , int height){
        this.width = width;
        this.height = height;
        int Area = height*width;
        System.out.println(Area);
    }

    // String Areaa(){
    //     return "Hello";
    // }
    
    
}

class Experiment{
    public static void main(String[] args) {
        Box b1 = new Box(10,20);
        Box b2 = new Box(200,30);
        
        
    
    }
}