public class recArrayPrint {

     static void printArray(int[] arr, int idx){
        // Base case
        if(idx == arr.length){
           return;
        }

        // self work
        System.out.println(arr[idx]);

        // recursive work
        printArray(arr, idx+1);
     }


    public static void main(String[] args) {
        int[] arr={4 , 5, 9 ,7};
        printArray(arr, 0);
        
    }
}
