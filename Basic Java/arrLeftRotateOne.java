
public class arrLeftRotateOne {
        
        static void oneRotate(int[] arr){
            int n= arr.length;
            int temp= arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]= arr[i];
             }
           arr[n-1]=temp;   
        }

    public static void main(String[] args) {
        int[] arr1={1 ,3,5,4,9};
        oneRotate(arr1);
        System.out.println("the one rotation");
        for( int nums: arr1){
            System.out.println(nums +" ");
        }
    }
}
