public class recArrayMaxInt {


    static int maxInt(int[] arr,int idx){
         if(idx == arr.length-1){
           return arr[idx];
        }
        // small problem
        int smallAns=maxInt(arr, idx+1);
        

        // self work
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr= {10,5,9,7,8};
        System.out.println(maxInt(arr, 0));
    }
}
