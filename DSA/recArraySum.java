public class recArraySum {

   static int sumArray(int[] arr, int idx){
// base case
       if(idx == arr.length-1){
        return arr[idx];
       }
       // small problem
       int sum= sumArray(arr, idx+1);
       return (sum+ arr[idx]);
   }



    public static void main(String[] args) {
       int [] arr={4,5,9,7,5};
       System.out.println(sumArray(arr, 0));

    }
}
